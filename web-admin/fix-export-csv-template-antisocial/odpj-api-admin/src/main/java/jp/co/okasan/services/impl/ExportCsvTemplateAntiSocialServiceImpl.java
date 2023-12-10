package jp.co.okasan.services.impl;

import jp.co.okasan.core.utils.CsvUtils;
import jp.co.okasan.domain.request.ExportUserRequest;
import jp.co.okasan.domain.response.ExportUserItemResponse;
import jp.co.okasan.exception.OkasanHttpException;
import jp.co.okasan.repositories.MUserRequestRepository;
import jp.co.okasan.services.ExportCsvTemplateAntiSocialService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExportCsvTemplateAntiSocialServiceImpl implements ExportCsvTemplateAntiSocialService {

    private final String FILENAME = "UserRequest";
    private final MUserRequestRepository mUserRequestRepository;
    @Override
    public byte[]  ExportCsvTemplateAntiSocial(ExportUserRequest request) {
        Page<ExportUserItemResponse> listMUserRequest = mUserRequestRepository.findUserRegister(request);
        if (listMUserRequest.isEmpty()) {
            throw new OkasanHttpException("DE000002");
        }
        return CsvUtils.writeCsv(listMUserRequest.getContent());
    }
}
