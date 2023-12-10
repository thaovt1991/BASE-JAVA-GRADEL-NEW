package jp.co.okasan.core.utils;

import java.io.InputStream;
import jp.co.okasan.core.errorhandler.domain.ReadFileCsvResult;

public interface CsvImportHelper<T> {
  ReadFileCsvResult readCsvFromInputStream(Class type, InputStream is);
}
