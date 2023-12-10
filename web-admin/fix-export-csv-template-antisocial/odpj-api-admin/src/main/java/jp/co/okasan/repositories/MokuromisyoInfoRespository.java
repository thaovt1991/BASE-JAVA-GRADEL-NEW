package jp.co.okasan.repositories;
import jp.co.okasan.entity.MokuromisyoInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MokuromisyoInfoRespository extends JpaRepository<MokuromisyoInfo,Integer>{

    @Query(value = "Select " +
            "row_number() over (order by DOCUMENT_CD desc) ROWID, " +
            "pi.DOCUMENT_CD, " +
            "pi.EDITION_CD, " +
            "pi.DOCUMENT_KBN, " +
            "pi.SEC_TYPE_KBN, " +
            "pi.VIEW_START_TM, " +
            "pi.DOCUMENT_DATE, " +
            "pi.DOCUMENT_FILE_NAME, " +
            "pi.DOCUMENT_NAME, " +
            "pi.DISP_FLG, " +
            "pi.POSTING_FLG " +
            "From " +
            "BOND_PRIMARY_ORDER AS bpo " +
            "INNER JOIN MOKUROMISYO_INFO as pi " +
            "ON " +
            "bpo.SEC_TYPE_KBN  = pi.SEC_TYPE_KBN " +
            "where " +
            "bpo.ISSUE_CD = :issue_cd",
            nativeQuery = true )
    List<MokuromisyoInfo> getEDocumentsByIssueCd(@Param("issue_cd") int issueCd);

}

