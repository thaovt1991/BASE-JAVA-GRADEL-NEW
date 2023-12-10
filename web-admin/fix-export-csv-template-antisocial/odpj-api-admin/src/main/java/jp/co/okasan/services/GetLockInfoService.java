package jp.co.okasan.services;

import jp.co.okasan.domain.request.GetLockInfoParam;
import jp.co.okasan.domain.response.GetLockInfoResponse;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

public interface GetLockInfoService {

    @NotNull
    GetLockInfoResponse getLockInfo(@NonNull GetLockInfoParam param);
}
