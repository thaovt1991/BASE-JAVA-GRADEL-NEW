package jp.co.okasan.controllers;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.search.ClientSearchCriteria;
import jp.co.okasan.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccPrivController {
	@Autowired
	private ClientService service;
	
	@PostMapping("/get-acc_priv")
	public ApiResponse exportCsv(@RequestBody ClientSearchCriteria searchCriteria) {
		return ApiResponse.builder()
				.result(ResponseResult.builder()
						.data(service.search(searchCriteria)).build())
				.build();
	}

}
