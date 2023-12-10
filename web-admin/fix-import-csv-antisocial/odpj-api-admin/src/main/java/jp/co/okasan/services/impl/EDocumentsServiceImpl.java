package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.GetEDocumentsRequest;
import jp.co.okasan.domain.response.EDocumentsResponse;
import jp.co.okasan.repositories.MokuromisyoInfoRespository;
import jp.co.okasan.services.EDocumentsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EDocumentsServiceImpl implements EDocumentsService {
    private final MessageConverter messageConverter;
    private final MokuromisyoInfoRespository eDocumentsRespository;
    public EDocumentsResponse getEDocumentsByIssueCd(@NonNull GetEDocumentsRequest param) {
        try {
            EDocumentsResponse eDocuments = getEDocuments(param);
            return eDocuments;
        } catch (Exception e) {
            log.error(MessagesCodes.DV000500.name(), e);
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DV000500)),
                    e);
        }
    }
    protected EDocumentsResponse getEDocuments(GetEDocumentsRequest param) {
        return new EDocumentsResponse(eDocumentsRespository.getEDocumentsByIssueCd(param.getIssueCd()));
    }

}
