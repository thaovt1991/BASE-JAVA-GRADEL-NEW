package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.domain.param.CodeMasterRequest;
import jp.co.okasan.services.CodeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code-master")
public class CodeMasterController {

    @Autowired
    private CodeMasterService codeMasterService;

    @PostMapping(value = "/list", produces = {"application/json"})
    public ApiResponse getUserInfo(@RequestBody CodeMasterRequest codeMasterRequest) {
        return codeMasterService.getCodeMasterList(codeMasterRequest);
    }
}
