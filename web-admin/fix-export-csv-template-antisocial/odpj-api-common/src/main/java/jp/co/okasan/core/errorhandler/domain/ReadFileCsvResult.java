package jp.co.okasan.core.errorhandler.domain;

import lombok.Data;

@Data
public class ReadFileCsvResult {
  boolean status;
  String Message;
  Object object;
}
