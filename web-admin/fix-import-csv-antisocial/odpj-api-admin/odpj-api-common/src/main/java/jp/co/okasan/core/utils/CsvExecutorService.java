package jp.co.okasan.core.utils;

import java.io.IOException;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface CsvExecutorService {
  byte[] toBytes(List<?> gridData) throws IOException;

  <T> List<T> toListObject(Class<T> inputData, MultipartFile file) throws IOException;
}
