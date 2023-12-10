package jp.co.okasan.core.utils.impl;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.*;
import java.util.List;
import jp.co.okasan.core.errorhandler.domain.ReadFileCsvResult;
import jp.co.okasan.core.utils.CsvImportHelper;
import org.springframework.stereotype.Service;

@Service
public class CsvImportHelperImpl<T> implements CsvImportHelper<T> {
  @Override
  public ReadFileCsvResult readCsvFromInputStream(Class type, InputStream is) {
    ReadFileCsvResult result = new ReadFileCsvResult();
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    int nRead;
    byte[] data = new byte[16384];
    while (true) {
      try {
        if (!((nRead = is.read(data, 0, data.length)) != -1)) break;
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      buffer.write(data, 0, nRead);
    }
    byte[] buff = buffer.toByteArray();
    Reader targetReader = new InputStreamReader(new ByteArrayInputStream(buff));
    CsvToBean<T> beans =
        new CsvToBeanBuilder(targetReader).withType(type).withThrowExceptions(false).build();
    List<T> resultList = beans.parse();
    List<CsvException> exceptions = beans.getCapturedExceptions();
    StringBuilder sb = new StringBuilder("");
    beans.getCapturedExceptions().stream()
        .forEach(
            (exception) -> {
              sb.append(exception.getLine());
              sb.append(String.join("#", exception.getMessage()));
            });
    String error = sb.toString();
    result.setStatus(true);
    if (!error.isEmpty() || !error.isBlank()) {
      result.setStatus(false);
      result.setMessage(error);
    }
    result.setObject(resultList);
    return result;
  }
}
