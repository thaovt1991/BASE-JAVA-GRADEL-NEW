package jp.co.okasan.repositories;

import jp.co.okasan.entity.AccountLockHistory;
import jp.co.okasan.entity.AccountLockHistoryPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountLockHistoryRepository extends JpaRepository<AccountLockHistory, AccountLockHistoryPK> {

    List<AccountLockHistory> findAccountLockHistoriesByBranchCdAndCustomerCd(String branchCd, Integer customerCd);
}
