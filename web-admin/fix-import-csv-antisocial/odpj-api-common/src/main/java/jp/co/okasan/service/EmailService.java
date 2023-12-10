package jp.co.okasan.service;

import jp.co.okasan.dto.EmailDto;

public interface EmailService {
  boolean sendEmail(EmailDto email);
}
