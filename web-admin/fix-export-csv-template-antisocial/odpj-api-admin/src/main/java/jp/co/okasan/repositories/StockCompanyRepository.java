package jp.co.okasan.repositories;

import jp.co.okasan.entity.MStockCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockCompanyRepository extends JpaRepository<MStockCompany, String> {}
