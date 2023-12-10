package jp.co.okasan.repositories;

import jp.co.okasan.entity.MRemark;
import jp.co.okasan.entity.MRemarkPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MRemarkRepository extends JpaRepository<MRemark, MRemarkPK> {

    Optional<MRemark> findById(MRemarkPK id);
}
