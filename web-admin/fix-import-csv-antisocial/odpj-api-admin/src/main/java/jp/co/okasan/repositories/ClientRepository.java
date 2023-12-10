package jp.co.okasan.repositories;

import jp.co.okasan.entity.Client;
import jp.co.okasan.entity.ClientPK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Repository
public interface ClientRepository
    extends JpaRepository<Client, ClientPK>, JpaSpecificationExecutor<Client> {
        Optional<Client> findClientByBranchCdAndCustomerCd(String branchCd, Integer customerCd);
        Page<Client> findClientByBranchCdAndCustomerCd(String branchCd, Integer customerCd, Pageable page);
}
