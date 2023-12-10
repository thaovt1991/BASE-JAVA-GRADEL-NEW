package jp.co.okasan.repositories;

import jp.co.okasan.entity.RoleInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleInfoRepository extends JpaRepository<RoleInfo, Integer> {
}
