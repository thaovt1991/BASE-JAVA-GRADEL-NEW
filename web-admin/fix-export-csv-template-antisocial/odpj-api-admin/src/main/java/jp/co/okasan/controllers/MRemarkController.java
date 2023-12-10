package jp.co.okasan.controllers;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.response.RemarkDTO;
import jp.co.okasan.mapper.MRemarkMapper;
import jp.co.okasan.services.MRemarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/remark")
public class MRemarkController {

    private final MessageConverter messageConverter;
    private final MRemarkService mRemarkService;
    private final MRemarkMapper mapper;

    @GetMapping(produces = {"application/json"})
    public ApiResponse getRemark(@RequestParam(value = "companyCd", required = false) String companyCd,
                                 @RequestParam(value = "entryNo", required = false) Integer entryNo, @RequestParam(value = "inputRouteCls", required = false) String inputRouteCls) {
        RemarkDTO remarkDTO = mapper.toDto(mRemarkService.findByCompanyCdAndEntryNoAndInRouterCls(companyCd,entryNo,inputRouteCls));
        return ApiResponse.builder()
                .result(ResponseResult.builder()
                        .data(remarkDTO)
                        .messages(List.of(messageConverter.convert(MessagesCodes.RM0001)))
                        .build())
                .build();
    }
}