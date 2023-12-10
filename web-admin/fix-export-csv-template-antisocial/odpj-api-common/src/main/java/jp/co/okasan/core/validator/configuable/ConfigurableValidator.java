package jp.co.okasan.core.validator.configuable;

import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;
import jp.co.okasan.core.validator.configuable.domain.ValidationRule;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.internal.metadata.core.ConstraintHelper;
import org.hibernate.validator.internal.util.annotation.AnnotationDescriptor;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

/** yaml/json のバリデーションルールを持ちてバリデーションを行う処理 */
@RequiredArgsConstructor
@Slf4j
public class ConfigurableValidator implements ConstraintValidator<ConfigurableValidation, Object> {
  private final ConfigurableValidatorConfig configurableValidatorConfig;
  private final ConstraintHelper constraintHelper = ConstraintHelper.forAllBuiltinConstraints();
  private final ValidatorFactory validatorFactory;
  private String ruleKey;

  @Override
  public void initialize(ConfigurableValidation constraintAnnotation) {
    ruleKey =
        constraintAnnotation == null || constraintAnnotation.value().isEmpty()
            ? null
            : constraintAnnotation.value();
  }

  @Override
  public boolean isValid(Object value, ConstraintValidatorContext context) {
    final var key = Objects.requireNonNullElse(ruleKey, value.getClass().getSimpleName());
    final var rules = configurableValidatorConfig.getRules().get(key);
    if (rules == null) {
      log.warn("validator rules for " + key + " is missing");
      return true;
    }
    if (CollectionUtils.isEmpty(rules)) {
      // バリデーションルールがないので、バリデーションを行わない
      return true;
    }
    return rules.entrySet().stream()
        .map(field -> isValidField(value, field.getKey(), field.getValue(), context))
        .reduce(true, (v1, v2) -> v1 && v2);
  }

  protected Object getFieldValue(Object value, String field) {
    if (value == null) {
      return null;
    }
    // FIXME nested field/method 対応
    if (field.indexOf('.') > -1) {
      // Nested Field
      for (final var f : field.split("\\.")) {
        value = getFieldValue(value, f);
      }
      return value;
    }
    final var f =
        Objects.requireNonNull(
            ReflectionUtils.findMethod(value.getClass(), "get" + StringUtils.capitalize(field)),
            field + " getter not found");
    return ReflectionUtils.invokeMethod(f, value);
  }

  protected Object convertValue(String text, Class<?> type) {
    if (type.isAssignableFrom(String.class)) {
      return text;
    }
    if (text.isEmpty()) {
      return null;
    }
    if (type.equals(long.class) || type.equals(Long.class)) {
      return Long.parseLong(text);
    }
    if (type.equals(double.class) || type.equals(Double.class)) {
      return Double.parseDouble(text);
    }
    if (type.equals(boolean.class) || type.equals(Boolean.class)) {
      return Boolean.parseBoolean(text);
    }
    if (type.equals(int.class) || type.equals(Integer.class)) {
      return Integer.parseInt(text);
    }
    if (type.equals(float.class) || type.equals(Float.class)) {
      return Float.parseFloat(text);
    }
    // FIXME その他型対応
    throw new IllegalArgumentException("cannot convert from [" + text + "] to " + type);
  }

  @SuppressWarnings("rawtypes,unchecked")
  protected Annotation createAnnotation(ValidationRule rule) {
    final var builder = new AnnotationDescriptor.Builder(rule.getAnnotation());
    final var fields = ReflectionUtils.getDeclaredMethods(rule.getAnnotation());

    for (final var m : fields) {
      if (!"annotation".equals(m.getName()) && rule.containsKey(m.getName())) {
        final var value = convertValue(rule.get(m.getName()), m.getReturnType());
        if (value != null) {
          builder.setAttribute(m.getName(), value);
        }
      }
    }
    return builder.build().getAnnotation();
  }

  protected void addError(String field, ValidationRule rule, ConstraintValidatorContext context) {
    // FIXME @Min, @Max などのパラメータはメッセージに反映されないため、yaml/json にメッセージを定義する必要
    // 解決方法は後で検討する
    context
        .buildConstraintViolationWithTemplate(
            Objects.requireNonNullElse(
                rule.getMessage(), "{" + rule.getAnnotation().getName() + ".message}"))
        .addPropertyNode(field)
        .addConstraintViolation();
  }

  @SuppressWarnings("rawtypes,unchecked")
  protected boolean isValidField(
      String field, Object value, ValidationRule rule, ConstraintValidatorContext context) {
    final var an = createAnnotation(rule);
    final var descriptors = constraintHelper.getAllValidatorDescriptors(rule.getAnnotation());
    //   final var valueType = value == null ? null : value.getClass().get
    return descriptors.stream()
        .map(
            descriptor -> {
              // 型対応しない場合バリデーションを行わない
              if (value != null
                  && !TypeFactory.rawClass(descriptor.getValidatedType()).isInstance(value)) {
                return true;
              }
              final ConstraintValidator constraint =
                  descriptor.newInstance(validatorFactory.getConstraintValidatorFactory());
              constraint.initialize(an);

              if (!constraint.isValid(value, context)) {
                addError(field, rule, context);
                return false;
              }
              return true;
            })
        .reduce(true, (v1, v2) -> v1 && v2);
  }

  protected boolean isValidField(
      Object value, String field, List<ValidationRule> rules, ConstraintValidatorContext context) {

    final var fieldValue = getFieldValue(value, field);
    return rules.stream()
        .map(
            rule ->
                "class".equals(field)
                    ? isValidField(field, value, rule, context)
                    : isValidField(field, fieldValue, rule, context))
        .reduce(true, (v1, v2) -> v1 && v2);
  }
}
