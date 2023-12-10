package jp.co.okasan.repositories;

import jp.co.okasan.entity.BondDiscreption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BondDiscreptionRepository extends JpaRepository<BondDiscreption, String> {

    Optional<BondDiscreption> findBondDiscreptionById(String issueCd);
}
