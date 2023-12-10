package jp.co.okasan.domain.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum IdentityDocumentsType {
  NONE,
  DRIVER_LICENSE,
  RESIDENCE_CARD,
  JAPANESE_PASSPORT
}
