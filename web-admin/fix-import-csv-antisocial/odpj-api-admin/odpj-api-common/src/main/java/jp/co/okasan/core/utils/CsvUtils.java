package jp.co.okasan.core.utils;

import com.opencsv.ICSVWriter;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import jp.co.okasan.core.convertor.message.MessageSourceHelper;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

/** Utilization for exporting CSV file */
public class CsvUtils {

  private CsvUtils() {}

  private static final String DEFAULT_CHARSET = "UTF-8";
  private static final String BUILDER_TYPE = "attachment";
  private static final String CONTENT_TYPE = "text/csv";

  /**
   * Write to CSV without headers
   *
   * @param content list data to write
   * @param <T> Type of data
   * @return byte[] content of CSV
   * @throws IOException
   * @throws CsvRequiredFieldEmptyException
   * @throws CsvDataTypeMismatchException
   */
  public static <T> byte[] writeCsv(List<T> content) {
    return write(content, null);
  }

  /**
   * Write to CSV with header class
   *
   * @param content list data to write
   * @param <T> Type of data
   * @return byte[] content of CSV
   * @throws IOException
   * @throws CsvRequiredFieldEmptyException
   * @throws CsvDataTypeMismatchException
   */
  public static <T> byte[] writeCsv(List<T> content, Class<T> clazz) {
    return write(content, clazz);
  }

  private static <T> byte[] write(List<T> content, Class<T> csvHeaderClass) {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    // BOM
    out.write(0xEF);
    out.write(0xBB);
    out.write(0xBF);
    try (OutputStreamWriter streamWriter = new OutputStreamWriter(out, DEFAULT_CHARSET)) {

      // Add headers for CSV
      if (Objects.nonNull(csvHeaderClass)) {
        streamWriter.write(getHeader(csvHeaderClass));
      }

      StatefulBeanToCsv<T> beanToCsv =
          new StatefulBeanToCsvBuilder<T>(streamWriter)
              .withQuotechar(ICSVWriter.DEFAULT_QUOTE_CHARACTER)
              .build();

      beanToCsv.write(content);

      streamWriter.flush();

      return out.toByteArray();
    } catch (Exception e) {

      throw new WebResponseErrorException(
          ApiResponse.builder()
              .result(
                  ResponseResult.builder()
                      .messages(Arrays.asList(MessageDetail.builder().code("S0001").build()))
                      .build())
              .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
              .build(),
          e);
    }
  }

  /**
   * Get Http Headers for download CSV request
   *
   * @param fileName
   * @return HttpHeaders
   */
  public static HttpHeaders getHttpHeader(String fileName) {
    HttpHeaders headers = new HttpHeaders();
    headers.add(HttpHeaders.CONTENT_TYPE, CONTENT_TYPE);
    headers.setContentDisposition(
        ContentDisposition.builder(BUILDER_TYPE)
            .filename(fileName, StandardCharsets.UTF_8)
            .build());
    return headers;
  }

  /**
   * Get resource form byte[]
   *
   * @param data
   * @return Resource
   */
  public static Resource getResource(byte[] data) {
    return new ByteArrayResource(data);
  }

  /**
   * Get headers of CSV
   *
   * @param csvOutputClass
   * @return Joined string of CSV headers
   */
  private static String getHeader(Class<?> csvOutputClass) {
    return Arrays.stream(csvOutputClass.getDeclaredFields())
            .filter(f -> f.getAnnotation(CsvBindByPosition.class) != null)
            .sorted(Comparator.comparing(f -> f.getAnnotation(CsvBindByPosition.class).position()))
            .map(
                f -> {
                  String column = f.getName();
                  return resolveHeader(csvOutputClass, column);
                })
            .collect(Collectors.joining(","))
        + "\n";
  }

  private static String resolveHeader(Class<?> csvOutputClass, String column) {
    return MessageSourceHelper.getMessage(
        String.format("csv.header.%s.%s", csvOutputClass.getSimpleName(), column));
  }
}
