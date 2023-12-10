package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.request.ElDlvDocParam;
import lombok.NonNull;

public interface EDocumentService {
    MessageDetail updateEDocument(@NonNull  ElDlvDocParam param);
}
