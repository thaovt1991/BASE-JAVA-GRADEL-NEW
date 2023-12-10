package jp.co.okasan.specification;


import jp.co.okasan.entity.Client;
import jp.co.okasan.search.ClientSearchCriteria;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mk on 10/12/2018.
 */
public class ClientSpecification {

	/**
	 * 
	 */

	private static boolean isInputValid(String input) {
		return !(input == null) && !input.isEmpty();
	}

	private static boolean isInputValid(Date input) {
		return !(input == null);
	}

	public static Specification<Client> search(ClientSearchCriteria filter) {
		return (Specification<Client>) (root, query, cb) -> {
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

			if(filter.getBranchCd()!=null){
				p17=cb.equal(root.get("id").get("branchCd"),filter.getBranchCd());
				sTp.add(p17);
			}
			if(filter.getCustomerCd()!=null){
				p17=cb.equal(root.get("id").get("customerCd"),filter.getCustomerCd());
				sTp.add(p16);
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
