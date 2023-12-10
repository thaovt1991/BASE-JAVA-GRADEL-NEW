package jp.co.okasan.specification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Logger;

public class CommonUtil {
  private static final Logger logger = Logger.getLogger(CommonUtil.class.getName());

  private static final String SHARED_SECRET_KEY = System.getenv("SHARED_SECRET_KEY");
  private static final String USER_AGENT = "Mozilla/5.0";

  public static Map<String, Field> getFieldBySerializedNames(Class<?> className) {
    Map<String, Field> nameToSerializedNameMap = new HashMap<String, Field>();
    for (Field field : className.getDeclaredFields()) {
      JsonProperty serializedName = field.getAnnotation(JsonProperty.class);
      if (serializedName != null && !field.isSynthetic()) {
        field.setAccessible(true);
        nameToSerializedNameMap.put(serializedName.value(), field);
      }
    }
    return nameToSerializedNameMap;
  }


  public static Object trimStringValues(Object obj) {
    for (Field field : obj.getClass().getDeclaredFields()) {
      try {
        field.setAccessible(true);
        Object value = field.get(obj);
        if (value != null && value instanceof String) {
          String trimmed = (String) value;
          field.set(obj, trimmed.trim());
        }
      } catch (Exception e) {
        ((org.slf4j.Logger) logger).error(e.getMessage(), e);
      }
    }
    return obj;
  }

  public static Map<String, Field> getDeclaredFields(Class<?> targetClass) {
    Map<String, Field> classFieldMap = new HashMap<String, Field>();
    for (Field field : targetClass.getDeclaredFields()) {
      if (!field.isSynthetic()) {
        classFieldMap.put(field.getName(), field);
      }
    }
    return classFieldMap;
  }

  public static String getColumnBySerializedName(Class<?> className, String serializedName) {
    Map<String, Field> nameToSerializedNameMap = CommonUtil.getFieldBySerializedNames(className);
    if (nameToSerializedNameMap.containsKey(serializedName)) {
      return nameToSerializedNameMap.get(serializedName).getName();
    } else {
      throw new IllegalArgumentException("No such field " + serializedName);
    }
  }

  public static String snakeCaseToCamelCase(String input) {
    if (input == null) {
      return input;
    }
    StringBuffer sb = new StringBuffer();
    for (String s : input.trim().split("_")) {
      if (sb.length() > 0) {
        sb.append(Character.toUpperCase(s.charAt(0)));
      } else {
        sb.append(Character.toLowerCase(s.charAt(0)));
      }
      if (s.length() > 1) {
        sb.append(s.substring(1, s.length()).toLowerCase());
      }
    }
    return sb.toString();
  }



  public static List<String> getListAlias(JSONArray groupByColumn, JSONArray aggregateColumn)
      throws JSONException {
    List<String> listAlias = new ArrayList<String>();
    if (groupByColumn != null && groupByColumn.length() > 0) {
      for (int i = 0; i < groupByColumn.length(); i++) {
        listAlias.add(groupByColumn.getJSONObject(i).getString("alias"));
      }
    }
    if (aggregateColumn != null && aggregateColumn.length() > 0) {
      for (int j = 0; j < aggregateColumn.length(); j++) {
        listAlias.add(aggregateColumn.getJSONObject(j).getString("alias"));
      }
    }
    return listAlias;
  }

  public static String getAliasFromEntity(Class<?> clazz) {
    String className = clazz.getSimpleName();
    return className.substring(0, 1).toLowerCase() + className.substring(1, className.length());
  }

  public static int genConfirmNo() {
    Random rn = new Random();
    return 100000 + rn.nextInt(999999 - 100000 + 1);
  }

  public static int genEntryNo() {
    Random rn = new Random();
    return rn.nextInt(Integer.MAX_VALUE);
  }

  public static String getYear(LocalDate birthDay) {
    if (birthDay == null) {
      return null;
    }
    return String.valueOf(birthDay.getYear());
  }

  public static String getMonth(LocalDate birthDay) {
    if (birthDay == null) {
      return null;
    }
    return String.valueOf(birthDay.getMonthValue());
  }

  public static String getDay(LocalDate birthDay) {
    if (birthDay == null) {
      return null;
    }
    return String.valueOf(birthDay.getDayOfMonth());
  }
}
