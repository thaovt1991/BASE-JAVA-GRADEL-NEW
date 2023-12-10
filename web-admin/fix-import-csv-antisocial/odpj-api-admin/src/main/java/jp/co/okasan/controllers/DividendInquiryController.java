package jp.co.okasan.controllers;

import java.io.IOException;

import javax.validation.Valid;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.core.utils.CsvExecutorService;
import jp.co.okasan.domain.request.GetDividendInquiryParam;
import jp.co.okasan.services.DividendInquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DividendInquiryController {

  private final DividendInquiryService service;
  private final CsvExecutorService csvExecutorService;

  @GetMapping("/get-dividend-inquiry")
  public ApiResponse getDividendInquiry(@Valid GetDividendInquiryParam param) {
    return ApiResponse.builder()
        .result(ResponseResult.builder().data(service.getDividendInquiry(param)).build())
        .build();
  }

  @GetMapping("/export-csv-dividend-inquiry")
  @Procedure("text/csv")
  public ResponseEntity<ByteArrayResource> exportCSVDividendInquiry(@Valid GetDividendInquiryParam param) throws
          IOException {
    ByteArrayResource resource = new ByteArrayResource(csvExecutorService.toBytes(service.getDividendInquiry(param).getDividendInfo()));
    return ResponseEntity.ok()
            .contentLength(resource.contentLength())
            .header(HttpHeaders.CONTENT_DISPOSITION,
                    ContentDisposition.attachment()
                            .filename("dividend-inquiry.csv")
                            .build()
                            .toString())
            .body(resource);
  }
}
