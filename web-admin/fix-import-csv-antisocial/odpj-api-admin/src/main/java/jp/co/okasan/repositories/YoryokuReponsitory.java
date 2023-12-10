package jp.co.okasan.repositories;

import jp.co.okasan.entity.Yoryoku;
import jp.co.okasan.entity.YoryokuPK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface YoryokuReponsitory extends JpaRepository<Yoryoku, YoryokuPK> {
   Page<Yoryoku> findClientByBranchCdAndCustomerCd(String branchCd, Integer customerCd, Pageable page);

}
