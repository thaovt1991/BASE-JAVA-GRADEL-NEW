package jp.co.okasan.repositories;

import jp.co.okasan.entity.BondTrade;
import jp.co.okasan.repositories.custom.BondTradeRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface BondTradeRepository extends JpaRepository<BondTrade, String>,
		BondTradeRepositoryCustom {

	long countByCustomerCdAndMarketCd(Integer clientCdOut, Integer marketCd);
	
	@Query("SELECT b FROM BondTrade b WHERE b.issueCd= :issueCd AND b.customerCd = :customerCd")
	Optional<BondTrade> findByIssueCdAndClientCd(@Param("issueCd") String issueCd, @Param("customerCd") Integer customerCd);

}
