package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.entity.InCashInfo;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.mapper.UpdateInCashInfoMapper;
import jp.co.okasan.domain.request.UpdateCashInfoRequest;
import jp.co.okasan.repositories.InCashInfoRepository;
import jp.co.okasan.services.InCashInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class InCashInfoServiceImpl implements InCashInfoService {
    private final InCashInfoRepository inCashInfoRepository;
    private final MessageConverter messageConverter;

    @Override
    public MessageDetail updateInCashInfo(@NonNull UpdateCashInfoRequest updateCashInfoRequest) {
        Optional<InCashInfo> inCashInfoSearch = Optional.ofNullable(getInCashInfos(updateCashInfoRequest));
        if (inCashInfoSearch.isPresent() == false) {
            return messageConverter.convert(MessagesCodes.DF010500);
        }
        InCashInfo inCashInfo = inCashInfoSearch.get();
        inCashInfo = UpdateInCashInfoMapper.INSTANCE.toDTO(updateCashInfoRequest);
        try {
            inCashInfoRepository.save(inCashInfo);
        } catch (Exception e) {
            log.error(MessagesCodes.DF010500.name(), e);
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DF010500)),
                    e);
        }
        return messageConverter.convert(MessagesCodes.UF01200);
    }
    protected InCashInfo getInCashInfos(UpdateCashInfoRequest updateCashInfoRequest){
        return inCashInfoRepository.searchInCashInfoById(updateCashInfoRequest.getInCashNo(),updateCashInfoRequest.getInputDate(),updateCashInfoRequest.getFileProcTm());
    }
}
