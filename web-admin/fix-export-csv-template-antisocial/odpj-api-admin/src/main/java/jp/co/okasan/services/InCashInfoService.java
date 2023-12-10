package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.request.UpdateCashInfoRequest;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

public interface InCashInfoService {
    @NotNull MessageDetail updateInCashInfo(@NonNull UpdateCashInfoRequest updateCashInfoRequest);
}
