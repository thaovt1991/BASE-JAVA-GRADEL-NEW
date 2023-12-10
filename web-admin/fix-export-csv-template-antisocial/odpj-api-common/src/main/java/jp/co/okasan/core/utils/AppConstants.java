package jp.co.okasan.core.utils;

public class AppConstants {
  public static final String ISO_8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
  public static final String FILTER_TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
  public static final String FILTER_DATE_FORMAT = "yyyy-MM-dd";
  public static final String AUTHENTICATED_USER_ATTR = "AuthenticatedUser";

  public static final String EXCEL_DATE_FORMAT = "dd-MMMM-yyyy";
  public static final String EXPORTED_TIME = "yyyy-MM-dd'T'HH:mm";

  public static final Integer DEFAULT_PAGE_SIZE = 5000;
  public static final Integer DEFAULT_MAX_NUM_RECORDS = 20000;

  public static final String EMAIL = "email";

  public static final String MESSAGE_FORBIDDEN = "You don't have permission";

  public static final String COMPANY_CD_DEFAULT = "VSII";
  public static final int REQUEST_EMAIL_EXPIRED_TIME = 24; // hours
}
