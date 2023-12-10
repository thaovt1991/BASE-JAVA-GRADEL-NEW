package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.dto.UserInfoDTO;
import jp.co.okasan.domain.request.SaveUserRequest;
import jp.co.okasan.domain.request.UserInfoParam;
import jp.co.okasan.domain.response.GetFormSaveUserResponse;
import org.springframework.data.domain.Page;
import org.springframework.lang.NonNull;

public interface UserInfoService {
    Page<UserInfoDTO> getUserInfo(UserInfoParam userInfoParam);

    GetFormSaveUserResponse getFormSaveUser();

    MessageDetail saveUser(@NonNull SaveUserRequest request);
}
