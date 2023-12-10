package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.domain.request.GetResourceInfoRequest;
import jp.co.okasan.domain.response.GetResourceInfoResponse;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

public interface YoryokuService {
    @NotNull GetResourceInfoResponse getResourceInfo(@NonNull GetResourceInfoRequest param);
}
