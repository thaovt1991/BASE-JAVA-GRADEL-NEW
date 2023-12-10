package jp.co.okasan.repositories;

import jp.co.okasan.entity.GsSysLog;
import jp.co.okasan.entity.GsSysLogPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GsSysLogRepository extends JpaRepository<GsSysLog, GsSysLogPK> {

    List<GsSysLog> findGsSysLogByBranchCd(String branchCd);
}
