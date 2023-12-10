package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.domain.param.CodeMasterRequest;

public interface CodeMasterService {

  ApiResponse getCodeMasterList(CodeMasterRequest codeMasterRequest);

}
