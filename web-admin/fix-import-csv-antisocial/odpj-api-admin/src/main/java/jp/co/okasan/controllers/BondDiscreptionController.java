
package jp.co.okasan.controllers;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;

import jp.co.okasan.domain.dto.BondDiscreptionDTO;
import jp.co.okasan.domain.param.ExportCsvBondsDetailParam;
import jp.co.okasan.domain.param.PrivilegeInquiryRequest;
import jp.co.okasan.services.BondDiscreptionService;
import jp.co.okasan.services.BondService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bondDiscreption")
public class BondDiscreptionController {
    private final BondService bondService;
    private final BondDiscreptionService bondDiscreptionService;
    @GetMapping("/get-privilege_inquiry")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ApiResponse getPrivilegeInquiry(@Valid @RequestBody PrivilegeInquiryRequest request) {
        return ApiResponse.builder()
                .result(ResponseResult.builder()
                        .data(bondService.getPrivilegeInquiry(request)).build())
                .build();
    }
    @PostMapping("/import-csv_bond_details")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ApiResponse importCsvBondDetails(@Valid @RequestBody MultipartFile request) throws IOException {
        return ApiResponse.builder()
                .result(ResponseResult.builder()
                        .data(bondService.importBondCsvFile(BondDiscreptionDTO.class, request.getInputStream())).build())
                .build();
    }
    @GetMapping("/export-csv-bonds-details")
    public ApiResponse exportCsvBondsDetails(@Valid ExportCsvBondsDetailParam param) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(bondDiscreptionService.exportCsvBondsDetail(param)).build()).build();
    }
}
