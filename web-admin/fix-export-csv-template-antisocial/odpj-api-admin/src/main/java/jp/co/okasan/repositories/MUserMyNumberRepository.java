package jp.co.okasan.repositories;

import jp.co.okasan.entity.MUserMyNumber;
import jp.co.okasan.entity.MUserMyNumberPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MUserMyNumberRepository extends JpaRepository<MUserMyNumber, MUserMyNumberPK> {
}
