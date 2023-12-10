package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.entity.ElDlvDoc;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.ElDlvDocParam;
import jp.co.okasan.repositories.ElDlvDocRepository;
import jp.co.okasan.services.EDocumentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EDocumentServiceImpl implements EDocumentService {
    private final ElDlvDocRepository elDlvDocRepository;
    private final MessageConverter messageConverter;

    @Override
    @Transactional
    public MessageDetail updateEDocument(ElDlvDocParam request) {
        ElDlvDoc elDlvDoc = elDlvDocRepository.findFirstByDocumentCd(request.getDocumentCd());
        try {
            if (!ObjectUtils.isEmpty(elDlvDoc)) {
                elDlvDoc.setDocumentCd(request.getDocumentCd());
                elDlvDoc.setElecDocFileTypeNm(request.getElecDocFileTypeNm());
                elDlvDoc.setElecDocFilepass(request.getElecDocFilepass());
                elDlvDoc.setDateSettingFlg(request.getDateSettingFlg());
                elDlvDoc.setExpireFlg(request.getValidFlg());
                elDlvDoc.setInputTm(request.getInputTm());
                elDlvDocRepository.save(elDlvDoc);
            }
        } catch (Exception e) {
            log.error(MessagesCodes.ED000502.name(), e);
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.ED000502)), e);
        }
        return messageConverter.convert(MessagesCodes.I000001);
    }
}
