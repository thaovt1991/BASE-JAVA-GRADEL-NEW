package jp.co.okasan.specification;


import jp.co.okasan.entity.FundPrice;
import jp.co.okasan.search.FundPriceSearchCriteria;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mk on 10/12/2018.
 */
public class FundPriceSpecification {

    /**
     *
     */

    private static boolean isInputValid(String input) {
        return !(input == null) && !input.isEmpty();
    }

    private static boolean isInputValid(Date input) {
        return !(input == null);
    }

    public static Specification<FundPrice> search(FundPriceSearchCriteria filter) {
        return (Specification<FundPrice>) (root, query, cb) -> {
            Predicate p1 = cb.and(); // true
            Predicate p2 = cb.and(); // true
            Predicate p3 = cb.and(); // true
            Predicate p4 = cb.and(); // true
            Predicate p5 = cb.and(); // true
            Predicate p6 = cb.and(); // true
            Predicate p7 = cb.and(); // true
            Predicate p8 = cb.and(); // true
            Predicate p9 = cb.and(); // true
            Predicate p10 = cb.and(); // true
            Predicate p11 = cb.and(); // true
            Predicate p12 = cb.and(); // true
            Predicate p13 = cb.and(); // true
            Predicate p14 = cb.and(); // true
            Predicate p15 = cb.and(); // true
            Predicate p16 = cb.and(); // true
            Predicate p17 = cb.and(); // true
            List<Predicate> sTp = new ArrayList<>();

            if (StringUtils.hasText(filter.getIssueCd())) {
                p17 = cb.equal(root.get("id").get("issueCd"), filter.getIssueCd());
                sTp.add(p17);
            }


            if (isInputValid(filter.getStdStartDt()) && isInputValid(filter.getStdEndDt())) {
				p3 = cb.greaterThanOrEqualTo(root.get("id").get("stdDt"), filter.getStdStartDt());
				p4 = cb.lessThanOrEqualTo(root.get("id").get("stdDt"), filter.getStdEndDt());
                sTp.add(p3);
                sTp.add(p4);
            }


            return cb.and(sTp.toArray(new Predicate[sTp.size()]));
        };
    }

    private static String normalize(String text) {
        if (StringUtils.isEmpty(text))
            return "%";
        return "%" + text + "%";
    }

}
