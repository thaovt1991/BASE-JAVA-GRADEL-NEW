package jp.co.okasan.dto;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailDto {
  private String from;
  private String[] to;
  private String[] cc;
  private String[] bcc;
  private String subject;
  private String bodyHtml;
  private String bodyText;
  private org.springframework.core.io.InputStreamResource attachment;
  private String attachmentName;

  public MimeMessage toMimeMessage(JavaMailSender mailSender) {
    MimeMessage mimeMessage = mailSender.createMimeMessage();
    MimeMessageHelper mimeMessageHelper = null;
    try {
      mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
      if (StringUtils.isBlank(from) || ArrayUtils.isEmpty(to)) {
        throw new IllegalArgumentException("Email from/to can not be blank");
      }
      mimeMessageHelper.setFrom(from);
      mimeMessageHelper.setTo(to);
      if (ArrayUtils.isNotEmpty(cc)) {
        mimeMessageHelper.setCc(cc);
      }
      if (ArrayUtils.isNotEmpty(bcc)) {
        mimeMessageHelper.setBcc(bcc);
      }
      mimeMessageHelper.setSubject(subject);
      if (attachment != null) {
        if (StringUtils.isBlank(attachmentName)) {
          throw new IllegalArgumentException("Attachment name can not be empty");
        }
        mimeMessageHelper.addAttachment(attachmentName, attachment);
      }
      if (StringUtils.isBlank(bodyText) && StringUtils.isBlank(bodyHtml)) {
        throw new IllegalArgumentException("Email body can not be empty");
      }
      if (StringUtils.isBlank(bodyText)) {
        mimeMessageHelper.setText(bodyHtml, true);
      } else {
        mimeMessageHelper.setText(bodyText, bodyHtml);
      }
      return mimeMessage;
    } catch (MessagingException e) {
      throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR, e);
    }
  }
}
