package jp.co.okasan.core.validator.configuable.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = DateRangeValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DateRange {
  String message() default "Start date must be before end date";

  String fieldDateFrom();

  String fieldDateTo();

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
