package jp.co.okasan.core.convertor.message;

import java.util.Locale;
import jp.co.okasan.core.convertor.message.domain.AbstractMessagesCodes;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageConverterImpl implements MessageConverter {
  private final MessageSource messageSource;

  @NonNull @Override
  public MessageDetail convert(@NonNull AbstractMessagesCodes code, Object... args) {
    return MessageDetail.builder()
        .code(code.toString())
        .message(messageSource.getMessage(code.toString(), args, Locale.getDefault()))
        .build();
  }

  @Override
  public MessageDetail convert(String code, Object... args) {
    String message = messageSource.getMessage(code, args, Locale.getDefault());
    return MessageDetail.builder().code(code).message(message).build();
  }
}
