package jp.co.okasan.repositories;

import jp.co.okasan.entity.ElDlvDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ElDlvDocRepository extends JpaRepository<ElDlvDoc, String>{
    ElDlvDoc findFirstByDocumentCd(String documentCd);
}