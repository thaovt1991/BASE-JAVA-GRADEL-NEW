package jp.co.okasan.repositories;

import jp.co.okasan.entity.MUserRequest;
import jp.co.okasan.entity.MUserRequestPK;
import jp.co.okasan.repositories.custom.MUserRequestRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MUserRequestRepository
    extends JpaRepository<MUserRequest, MUserRequestPK>, MUserRequestRepositoryCustom {

}
