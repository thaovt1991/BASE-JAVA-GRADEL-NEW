package jp.co.okasan.repositories.impl;

import jp.co.okasan.domain.dto.CustomerDTO;
import jp.co.okasan.entity.Client;
import jp.co.okasan.entity.GsSysLog;
import jp.co.okasan.entity.LoginInfo;
import jp.co.okasan.repositories.ClientRepositoryCustom;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClientRepositoryCustomImpl implements ClientRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<CustomerDTO> getListCustomer(String branchCd, Integer customerCd, String name, String kanaName) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<CustomerDTO> query = builder.createQuery(CustomerDTO.class);

        Root<Client> cl = query.from(Client.class);
        Root<LoginInfo> lg = query.from(LoginInfo.class);
        Root<GsSysLog> gs = query.from(GsSysLog.class);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(builder.equal(cl.get("branchCd"), lg.get("branchCd")));
        predicates.add(builder.equal(cl.get("branchCd"), gs.get("branchCd")));
        predicates.add(builder.equal(cl.get("branchCd"), branchCd));

        predicates.add(builder.equal(cl.get("customerCd"), lg.get("customerCd")));
        predicates.add(builder.equal(cl.get("customerCd"), customerCd));

        if (name != null) {
            predicates.add(builder.equal(cl.get("nameMei"), name));
            predicates.add(builder.equal(cl.get("nameSei"), name));
        }

        if (kanaName != null) {
            predicates.add(builder.equal(cl.get("kanaNameMei"), kanaName));
            predicates.add(builder.equal(cl.get("kanaNameSei"), kanaName));
        }

        TypedQuery typedQuery = entityManager.createQuery(query.multiselect(cl.get("customerCd"), cl.get("nameMei"), cl.get("nameSei")
                        , cl.get("kanaNameMei"), cl.get("kanaNameSei"), cl.get("birthDate"), cl.get("sex"), lg.get("lastSuccessTm")
                        , gs.get("logData"), gs.get("ipAddress"))
                .where(predicates.toArray(new Predicate[]{})));

        return typedQuery.getResultList();
    }
}


