package jp.co.okasan.repositories;

import jp.co.okasan.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.lang.NonNull;

import java.util.Optional;
@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {
    long countByBranchCd(Integer branchCd);
    Optional<Branch> findByBranchCdAndExpireFlg(@NonNull Integer branchCd, Integer expireFlg);
}
