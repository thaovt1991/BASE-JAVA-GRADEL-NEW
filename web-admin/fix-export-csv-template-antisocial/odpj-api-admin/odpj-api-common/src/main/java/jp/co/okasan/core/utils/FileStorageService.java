package jp.co.okasan.core.utils;

import java.io.File;
import java.io.InputStream;

public interface FileStorageService {

  String store(File file);

  String store(File file, String fileName);

  String store(byte[] data, String fileName);

  String store(InputStream data, String fileName);

  String store(InputStream data, String fileName, String directory);
}
