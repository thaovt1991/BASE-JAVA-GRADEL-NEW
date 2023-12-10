package jp.co.okasan.core.utils;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/** Utilization for date type */
public class DateUtils {

  public static Date atStartOfDay(Date date) {
    if (date == null) {
      return null;
    }
    LocalDateTime localDateTime = dateToLocalDateTime(date);
    LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
    return localDateTimeToDate(startOfDay);
  }

  public static Date atEndOfDay(Date date) {
    if (date == null) {
      return null;
    }
    LocalDateTime localDateTime = dateToLocalDateTime(date);
    LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
    return localDateTimeToDate(endOfDay);
  }

  private static LocalDateTime dateToLocalDateTime(Date date) {
    return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
  }

  private static Date localDateTimeToDate(LocalDateTime localDateTime) {
    return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
  }
}
