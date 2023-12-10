package jp.co.okasan.repositories;

import java.util.List;
import java.util.Map;
import jp.co.okasan.entity.LoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginInfoRepository extends JpaRepository<LoginInfo, String> {
  @Query(value = " SELECT " +
      "        li.loginId as loginId," +
      "        cl.corpShortNm as corpShortNm," +
      "        cl.clientNm as clientNm," +
      "        cl.kojinHojinType as kojinHojinType" +
      "   FROM jp.co.okasan.entity.LoginInfo li  " +
      "        INNER JOIN  " +
      "     jp.co.okasan.entity.Client cl  " +
      "        ON  " +
      "     li.customerCd = cl.customerCd  " +
      " WHERE cl.customerCd = :customerCd ")
  List<Map<String, String>> getUserInfo(@Param("customerCd") int customerCd);
}
