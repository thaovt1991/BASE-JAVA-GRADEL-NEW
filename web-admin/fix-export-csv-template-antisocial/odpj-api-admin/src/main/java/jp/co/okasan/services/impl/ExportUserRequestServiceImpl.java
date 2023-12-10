package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.core.utils.CsvUtils;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.mapper.ExportUserRequestMapper;
import jp.co.okasan.domain.request.ExportUserRequest;
import jp.co.okasan.domain.response.ExportUserItemResponse;
import jp.co.okasan.exception.OkasanHttpException;
import jp.co.okasan.repositories.MUserRequestRepository;
import jp.co.okasan.services.ExportUserRequestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class ExportUserRequestServiceImpl implements ExportUserRequestService {
    private final MUserRequestRepository mUserRequestRepository;

    private final MessageConverter messageConverter;

    @Override
    public byte[] exportUserRequest(ExportUserRequest request) {

        Page<ExportUserItemResponse> listMUserRequest = mUserRequestRepository.findUserRegister(request);

        if (listMUserRequest.isEmpty()) {
            throw new OkasanHttpException("EU000002");
        }

        return CsvUtils.writeCsv(listMUserRequest.getContent());
    }

}
