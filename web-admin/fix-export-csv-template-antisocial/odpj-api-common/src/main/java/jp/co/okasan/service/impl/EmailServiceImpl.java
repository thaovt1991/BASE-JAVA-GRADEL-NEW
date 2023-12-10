package jp.co.okasan.service.impl;

import javax.mail.internet.MimeMessage;
import jp.co.okasan.dto.EmailDto;
import jp.co.okasan.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

  private final JavaMailSender emailSender;

  @Override
  public boolean sendEmail(@NonNull EmailDto email) {
    MimeMessage message = email.toMimeMessage(emailSender);
    emailSender.send(message);
    return false;
  }
}
