package jp.co.okasan.repositories;

import jp.co.okasan.entity.FundPrice;
import jp.co.okasan.entity.FundPricePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface FundPriceRepository
        extends JpaRepository<FundPrice, FundPricePK>, JpaSpecificationExecutor<FundPrice> {
    @Query(value = "SELECT * FROM FUND_PRICE WHERE ISSUE_CD=:issueCd AND STD_DT=:stdDt", nativeQuery = true)
    FundPrice getByIssueCdAndStd(@Param("issueCd") String issueCd, @Param("stdDt") String stdDt);
}
