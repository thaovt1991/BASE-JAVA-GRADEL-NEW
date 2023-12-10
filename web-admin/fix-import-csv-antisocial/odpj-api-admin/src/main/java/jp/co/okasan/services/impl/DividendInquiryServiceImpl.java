package jp.co.okasan.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;

import jp.co.okasan.entity.FundDiscreption;
import jp.co.okasan.entity.FundDivProfit;
import jp.co.okasan.domain.response.GetDividendInquiryResponse;
import jp.co.okasan.domain.request.GetDividendInquiryParam;
import jp.co.okasan.repositories.FundDiscreptionRepository;
import jp.co.okasan.repositories.FundDivProfitRepository;
import jp.co.okasan.services.DividendInquiryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DividendInquiryServiceImpl implements DividendInquiryService {

  private final FundDivProfitRepository fundDivProfitRepository;
  private final FundDiscreptionRepository fundDiscreptionRepository;

  @NotNull @Override
  public GetDividendInquiryResponse getDividendInquiry(@NonNull GetDividendInquiryParam param) {
    GetDividendInquiryResponse result = new GetDividendInquiryResponse();
    Pageable pageable = PageRequest.of(param.getPageNumber()==null?(param.getPageNumber()-1):0, param.getPageSize());
    Page<FundDivProfit> fundDivProfitPage = fundDivProfitRepository.findByIssueCdAndInputTmBetween(param.getIssueCd(),
            param.getFromDate(), param.getToDate(), pageable);
    fundDivProfitPage.getTotalElements();
    result.setTotal(fundDivProfitPage.getTotalPages());
    Optional<FundDiscreption> optional = fundDiscreptionRepository.findById(param.getIssueCd());
    final String secShortDescKanji = optional.isPresent()? optional.get().getSecShortDescKanji(): "";
    // wait for logic of
    List<FundDivProfit> fundDivProfitList = fundDivProfitPage.stream().map(
            f -> {
              f.setSecShortDescKanji(secShortDescKanji);
              return f;
            }
    ).collect(Collectors.toList());
    result.setDividendInfo(fundDivProfitList);
    return result;
  }
}
