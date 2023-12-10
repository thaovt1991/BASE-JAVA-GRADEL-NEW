package jp.co.okasan.utils;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateFormatUtil {
    public static Date dateFormatter(String value) throws ParseException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(AppConstants.FILTER_DATE_FORMAT);
        return dateFormatter.parse(value);
    }

    public Date dateTimeFormatter(String value) throws ParseException {
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat(AppConstants.FILTER_TIMESTAMP_FORMAT);
        Date result = null;
        ParseException exception = null;
        try {
            result = dateTimeFormatter.parse(value);
        } catch (ParseException e) {
            exception = e;
        }
        // Try with date format if timestamp format is not matched
        if (result == null) {
            result = this.dateFormatter(value);
        }
        if (result == null && exception != null) {
            throw exception;
        }
        return result;
    }

    public Timestamp dateTimeStamp(String value) throws ParseException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(AppConstants.FILTER_DATE_FORMAT);
        return new Timestamp(dateFormatter.parse(value).getTime());
    }

    public Timestamp getFormatTimeStamp(String value) throws ParseException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(AppConstants.FILTER_TIMESTAMP_FORMAT);
        return new Timestamp(dateFormatter.parse(value).getTime());
    }
}
