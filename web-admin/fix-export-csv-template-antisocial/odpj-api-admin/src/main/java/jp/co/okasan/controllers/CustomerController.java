package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.GetListCustomerParam;
import jp.co.okasan.domain.response.GetCustomerItemResponse;
import jp.co.okasan.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/customer/")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("get-customer-by-cd")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse getCustomerByCd(@Valid @RequestParam String branchCd,
                                       @RequestParam Integer customerCd) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(GetCustomerItemResponse.
                        toGetCustomerByCdResponse(customerService.getCustomerByCd(branchCd,customerCd))).build())
                .build();
    }

    @GetMapping("get-list-customers")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse getListCustomer(@Valid @RequestBody GetListCustomerParam pram) {

        return ApiResponse.builder()
                .result(ResponseResult.builder().data(customerService.getListCustomer(pram)).build())
                .build();
    }
}
