package jp.co.okasan.services;

import jp.co.okasan.domain.response.RemarkDTO;
import jp.co.okasan.entity.MRemark;

public interface MRemarkService {

    MRemark findByCompanyCdAndEntryNoAndInRouterCls(String companyCd, Integer entryNo, String inputRouteCls);

}
