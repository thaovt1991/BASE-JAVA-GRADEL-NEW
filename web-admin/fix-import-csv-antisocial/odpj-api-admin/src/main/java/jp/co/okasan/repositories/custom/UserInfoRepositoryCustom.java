package jp.co.okasan.repositories.custom;

import jp.co.okasan.domain.dto.UserInfoDTO;
import jp.co.okasan.domain.request.UserInfoParam;
import org.springframework.data.domain.Page;

public interface UserInfoRepositoryCustom {
    Page<UserInfoDTO> getUserInfo(UserInfoParam userInfoParam);
}
