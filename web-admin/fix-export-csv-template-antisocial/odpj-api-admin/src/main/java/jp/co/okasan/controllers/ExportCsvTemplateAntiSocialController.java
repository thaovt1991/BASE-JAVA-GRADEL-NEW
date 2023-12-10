package jp.co.okasan.controllers;

import jp.co.okasan.core.utils.CsvUtils;
import jp.co.okasan.domain.request.ExportUserRequest;
import jp.co.okasan.services.ExportCsvTemplateAntiSocialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/m-antisocial-forces")
public class ExportCsvTemplateAntiSocialController {
    private final ExportCsvTemplateAntiSocialService exportCsvTemplateAntiSocialService;
    @PostMapping("/csv")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> exportCsvTemplateAntiSocial(@Valid @RequestBody ExportUserRequest request) {
        byte[] data = exportCsvTemplateAntiSocialService.ExportCsvTemplateAntiSocial(request);
        return ResponseEntity.ok()
                .headers(CsvUtils.getHttpHeader("template-antisocial.csv"))
                .body(data);
    }
}
