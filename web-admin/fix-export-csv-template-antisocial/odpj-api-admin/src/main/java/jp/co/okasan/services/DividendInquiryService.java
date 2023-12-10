package jp.co.okasan.services;

import javax.validation.constraints.NotNull;

import jp.co.okasan.domain.request.GetDividendInquiryParam;
import jp.co.okasan.domain.response.GetDividendInquiryResponse;
import org.springframework.lang.NonNull;

public interface DividendInquiryService {
  @NotNull GetDividendInquiryResponse getDividendInquiry(@NonNull GetDividendInquiryParam param);
}
