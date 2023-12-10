package jp.co.okasan.repositories;

import jp.co.okasan.entity.CodeMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CodeMasterRepository extends JpaRepository<CodeMaster, Integer> {
    List<CodeMaster> getByDeleteFlgNotLike(String deleteFlg);
}
