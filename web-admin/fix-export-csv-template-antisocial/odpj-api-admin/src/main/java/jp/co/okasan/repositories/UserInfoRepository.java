package jp.co.okasan.repositories;

import jp.co.okasan.entity.UserInfo;
import jp.co.okasan.entity.UserInfoPK;
import jp.co.okasan.repositories.custom.UserInfoRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserInfoRepository extends JpaRepository<UserInfo, UserInfoPK>,
    UserInfoRepositoryCustom {

}
