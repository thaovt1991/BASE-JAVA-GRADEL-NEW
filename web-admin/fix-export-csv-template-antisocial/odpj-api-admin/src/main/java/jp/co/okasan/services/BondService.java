package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.dto.PrivilegeInquiryDto;
import jp.co.okasan.domain.param.PrivilegeInquiryRequest;
import org.springframework.lang.NonNull;

import java.io.InputStream;
import java.util.List;

public interface BondService {
    @NonNull
    List<PrivilegeInquiryDto> getPrivilegeInquiry(@NonNull PrivilegeInquiryRequest request);
    MessageDetail importBondCsvFile(Class type , InputStream inputStream) ;
}
