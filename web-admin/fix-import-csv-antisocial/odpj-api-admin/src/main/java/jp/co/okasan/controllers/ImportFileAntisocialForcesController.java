package jp.co.okasan.controllers;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.services.ImportCsvAntiSocialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/m-antisocial-forces")
public class ImportFileAntisocialForcesController {
  private final ImportCsvAntiSocialService importCsvAntiSocialService;
  private final MessageConverter messageConverter;

  @PostMapping("/import-csv-antisocial")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public ApiResponse importCsvAntiSocialForces(@Valid MultipartFile file) throws IOException {
    return ApiResponse.builder()
            .result(ResponseResult.builder()
                    .data(importCsvAntiSocialService.importAntiSocialForces(file))
                    .messages(List.of(messageConverter.convert(MessagesCodes.EU0002)))
                    .build())
            .build();
  }
}
