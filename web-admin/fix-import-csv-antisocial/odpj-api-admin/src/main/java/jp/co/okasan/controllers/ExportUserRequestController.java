package jp.co.okasan.controllers;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.utils.CsvUtils;
import jp.co.okasan.domain.request.ExportUserRequest;
import jp.co.okasan.services.ExportUserRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user-request")
public class ExportUserRequestController {
    private final ExportUserRequestService exportUserRequestService;
    @PostMapping("/csv")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> exportUserRequest(@RequestBody ExportUserRequest request) {
        byte[] data = exportUserRequestService.exportUserRequest(request);
        return ResponseEntity.ok()
                .headers(CsvUtils.getHttpHeader("user-request.csv"))
                .body(data);
    }
}
