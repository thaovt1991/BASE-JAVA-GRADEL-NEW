package jp.co.okasan.core.validator.configuable.custom;

import java.util.Date;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class DateRangeValidator implements ConstraintValidator<DateRange, Object> {

  private String from;
  private String to;

  public void initialize(DateRange constraintAnnotation) {
    this.from = constraintAnnotation.fieldDateFrom();
    this.to = constraintAnnotation.fieldDateTo();
  }

  public boolean isValid(Object value, ConstraintValidatorContext context) {

    Object dateFrom = new BeanWrapperImpl(value).getPropertyValue(from);
    Object dateTo = new BeanWrapperImpl(value).getPropertyValue(to);

    if (dateFrom == null || dateTo == null) {
      return true;
    }
    return !((Date) dateFrom).after((Date) dateTo);
  }
}
