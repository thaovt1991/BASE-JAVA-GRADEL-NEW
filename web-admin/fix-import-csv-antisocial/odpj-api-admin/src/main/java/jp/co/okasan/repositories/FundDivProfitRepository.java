package jp.co.okasan.repositories;

import java.util.Date;

import jp.co.okasan.entity.FundDivProfit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundDivProfitRepository extends JpaRepository<FundDivProfit, String> {
    Page<FundDivProfit> findByIssueCdAndInputTmBetween(String issueCd, Date fromDate, Date toDate, Pageable pageable);
}
