package jp.co.okasan.repositories;

import jp.co.okasan.entity.AccountLock;
import jp.co.okasan.entity.AccountLockPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountLockRepository extends JpaRepository<AccountLock, AccountLockPK> {

    Optional<AccountLock> findAccountLockByBranchCdAndCustomerCd(String branchCd, Integer customerCd);
}
