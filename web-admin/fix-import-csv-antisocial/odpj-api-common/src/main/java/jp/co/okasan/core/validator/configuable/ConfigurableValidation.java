package jp.co.okasan.core.validator.configuable;

import java.lang.annotation.*;
import javax.validation.Constraint;

/**
 * JSON/YAMLなどの定義でバリデーションを行う <strong
 * color="red">Cacheなどの仕組みがないため、Spring　Bootのデフォルトのバリデーションより重いです</strong>
 *
 * <pre>{@code 例：
 * okasan:
 *   common:
 *     configurable-validator:
 *       rules:
 *         TestValidatorDto:
 *           field1:
 *             - annotation: javax.validation.constraints.NotNull
 *               message: " aa"
 *           field2:
 *             - annotation: javax.validation.constraints.NotEmpty
 *           number:
 *             - annotation: javax.validation.constraints.Min
 *               value: 10
 *           nested:
 *             value:
 *               - annotation: javax.validation.constraints.Max
 *                 value: -1
 *               - annotation: javax.validation.constraints.NotNull
 * }</pre>
 */
@Documented
@Constraint(validatedBy = ConfigurableValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigurableValidation {
  /** 設定内のキー、デフォルト simple class name */
  String value() default "";

  String message() default
      "{jp.co.okasan.core.validator.configuable.ConfigurableValidation.message}";

  Class[] groups() default {};

  Class[] payload() default {};
}
