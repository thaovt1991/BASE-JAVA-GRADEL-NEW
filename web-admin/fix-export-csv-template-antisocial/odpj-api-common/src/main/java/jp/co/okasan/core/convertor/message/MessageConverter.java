package jp.co.okasan.core.convertor.message;

import jp.co.okasan.core.convertor.message.domain.AbstractMessagesCodes;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import org.springframework.lang.NonNull;

public interface MessageConverter {

  /** create Message detail from code */
  @NonNull MessageDetail convert(@NonNull AbstractMessagesCodes code, Object... args);

  MessageDetail convert(@NonNull String code, Object... args);
}
