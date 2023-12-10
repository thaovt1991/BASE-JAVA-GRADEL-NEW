package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.param.UpdateLockInfoRequest;
import org.springframework.lang.NonNull;

public interface AccountLockService {
    @NonNull
    MessageDetail updateLockInfo(@NonNull UpdateLockInfoRequest request);
}
