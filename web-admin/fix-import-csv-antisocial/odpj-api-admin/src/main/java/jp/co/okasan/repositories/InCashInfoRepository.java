package jp.co.okasan.repositories;

import jp.co.okasan.entity.InCashInfo;
import jp.co.okasan.entity.InCashInfoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface InCashInfoRepository extends JpaRepository<InCashInfo, InCashInfoPK> {

     final String searchInCashInfoByIdQuery = "select * from IN_CASH_INFO as i WHERE i.IN_CASH_NO = :in_cash_no " +
            "AND " +
            "i.INPUT_DATE >= :input_date AND i.INPUT_DATE < (:input_date + 1) " +
            "AND " +
            "i.FILE_PROC_TM >= :file_proc_tm AND i.FILE_PROC_TM < (:file_proc_tm + 1)";
    @Query(value = searchInCashInfoByIdQuery
            , nativeQuery = true)
    InCashInfo searchInCashInfoById(@Param("in_cash_no") Integer inCashNo,
                                    @Param("input_date") Date inputDate,
                                    @Param("file_proc_tm") Date fileProcTm);

}
