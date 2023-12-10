package jp.co.okasan.core.convertor.message;

import java.util.Locale;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageSourceHelper implements MessageSourceAware {

  private static MessageSource messageSource;

  @Override
  public void setMessageSource(final MessageSource source) {
    messageSource = source;
  }

  public static String getMessage(String code, Object... args) {
    try {
      return messageSource.getMessage(code, args, Locale.getDefault());
    } catch (NoSuchMessageException ex) {
      log.warn("Can not find message with code #{}", code);
      return code;
    }
  }
}
