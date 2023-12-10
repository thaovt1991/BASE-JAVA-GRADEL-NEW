package jp.co.okasan.repositories;

import jp.co.okasan.entity.MAntiSocialForces;
import jp.co.okasan.entity.MAntiSocialForcesPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MAntiSocialForcesRepository
    extends JpaRepository<MAntiSocialForces, MAntiSocialForcesPK> {}
