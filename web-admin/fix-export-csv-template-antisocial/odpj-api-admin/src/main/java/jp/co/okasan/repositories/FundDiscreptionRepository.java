package jp.co.okasan.repositories;

import jp.co.okasan.entity.FundDiscreption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundDiscreptionRepository extends JpaRepository<FundDiscreption, String> {}
