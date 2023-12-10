package jp.co.okasan.repositories;

import jp.co.okasan.entity.MNameIdentification;
import jp.co.okasan.entity.MNameIdentificationPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MNameIdentificationRepository
        extends JpaRepository<MNameIdentification, MNameIdentificationPK> {

    List<MNameIdentification> findAllByEntryNoAndClientNo(
            @Param("entryNo") Integer entryNo, @Param("clientNo") Integer clientNo);
}