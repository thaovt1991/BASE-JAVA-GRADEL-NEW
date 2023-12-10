package jp.co.okasan.controllers;

import javax.validation.Valid;

import jp.co.okasan.domain.request.UpdateTradingRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.services.BondTradeService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/update-trading")
public class UpdateTradingController {
	
	private final BondTradeService bondTradeService;
	
	@PostMapping
	public ApiResponse updatetrading(@Valid @RequestBody UpdateTradingRequest param) {
		return ApiResponse.builder()
				.result(ResponseResult.builder().data(bondTradeService.updateTrading(param)).build())
				.build();
	}

}
