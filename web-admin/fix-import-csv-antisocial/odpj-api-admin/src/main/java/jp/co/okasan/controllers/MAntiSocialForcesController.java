package jp.co.okasan.controllers;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.GetAntisocialForcesParam;
import jp.co.okasan.entity.MAntiSocialForces;
import jp.co.okasan.services.MAntiSocialForcesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/antisocial-forces")
public class MAntiSocialForcesController {
	private final MessageConverter messageConverter;
	private final MAntiSocialForcesService mAntisocialForcesService;

	@GetMapping("/get-antisocial-forces")
	public ApiResponse getAntisocialForces(@Valid @RequestBody GetAntisocialForcesParam param) {
		Optional<MAntiSocialForces> mAntiSocialForces = mAntisocialForcesService.getAntisocialForces(param);
		return ApiResponse.builder()
			.result(
				ResponseResult.builder()
					.data(mAntiSocialForces)
					.messages(List.of(messageConverter.convert(MessagesCodes.R000002)))
					.build())
			.build();
	}
}
