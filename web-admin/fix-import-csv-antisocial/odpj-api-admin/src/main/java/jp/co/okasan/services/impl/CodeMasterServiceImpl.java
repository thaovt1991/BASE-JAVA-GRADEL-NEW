package jp.co.okasan.services.impl;

import jp.co.okasan.config.Constants;
import jp.co.okasan.core.cache.DataCache;
import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.entity.CodeMaster;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.param.CodeMasterRequest;
import jp.co.okasan.domain.response.CodeMasterResponse;
import jp.co.okasan.repositories.CodeMasterRepository;
import jp.co.okasan.services.CodeMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CodeMasterServiceImpl implements CodeMasterService {

    private final MessageConverter messageConverter;
    private final CodeMasterRepository codeMasterRepository;
    private final DataCache dataCache;

    @Override
    public ApiResponse getCodeMasterList(CodeMasterRequest codeMasterRequest) {
        try {

            CodeMasterResponse codeMasterResponse = new CodeMasterResponse();
//            try {
//                if (codeMasterRequest.getFields().isEmpty()) {
//                    dataCache.remove(CodeMasterResponse.class.getName());
//                }
//                codeMasterResponse = dataCache.get(
//                        CodeMasterResponse.class.getName(),
//                        CodeMasterResponse.class,
//                        () -> new CodeMasterResponse(codeMasterRepository.getByDeleteFlgNotLike(String.valueOf(Constants.DELETE_FLAG_NO))));
//            } catch (Exception e){
//                codeMasterResponse = new CodeMasterResponse(codeMasterRepository.getByDeleteFlgNotLike(String.valueOf(Constants.DELETE_FLAG_NO)));
//            }
            codeMasterResponse = new CodeMasterResponse(codeMasterRepository.getByDeleteFlgNotLike(String.valueOf(Constants.DELETE_FLAG_NO)));
            if (!codeMasterRequest.getFields().isEmpty()) {
                List<CodeMaster> masterList = codeMasterResponse.getCodeMasters().stream().filter(item -> codeMasterRequest.getFields().contains(item.getField())).collect(Collectors.toList());
                return ApiResponse.builder().result(ResponseResult.builder().data(masterList).build()).build();
            }
            return ApiResponse.builder().result(ResponseResult.builder().data(codeMasterResponse.getCodeMasters()).build()).build();

        } catch (Exception exception) {
            MessageDetail messageDetail = messageConverter.convert(MessagesCodes.DM07500);
            return ApiResponse.builder().result(ResponseResult.builder().messages(List.of(messageDetail)).build()).build();
        }
    }
}
