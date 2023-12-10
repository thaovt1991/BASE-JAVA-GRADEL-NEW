package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.param.UpdateUserAntisocialStatusRequest;
import jp.co.okasan.domain.param.UpdateUserIdentifiStatusRequest;
import jp.co.okasan.entity.MUserRequest;
import jp.co.okasan.entity.MUserRequestPK;
import jp.co.okasan.exception.OkasanHttpException;
import jp.co.okasan.repositories.MUserRequestRepository;
import jp.co.okasan.services.MUserRequestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MUserRequestServiceImpl implements MUserRequestService {

    private final MUserRequestRepository mUserRequestRepository;
    private final MessageConverter messageConverter;
    @Override
    @Transactional
    public void updateUserIdentifyStatus(UpdateUserIdentifiStatusRequest updateUserIdentification) {
        MUserRequestPK id = new MUserRequestPK(updateUserIdentification.getCompanyCd(), updateUserIdentification.getEntryNo());
        MUserRequest userRequest = mUserRequestRepository.findById(id).orElseThrow(() -> new OkasanHttpException(
          MessagesCodes.VU000002.name(), messageConverter.convert(MessagesCodes.VU000002).getMessage()));
        userRequest.setIdentityDocumentsStatus(updateUserIdentification.getIdentityDocumentsStatus());
        mUserRequestRepository.save(userRequest);
    }
    @Override
    @Transactional
    public void updateUserAntiSocialStatus(
      UpdateUserAntisocialStatusRequest updateUserAntisocialStatus) {

        MUserRequestPK id = new MUserRequestPK(updateUserAntisocialStatus.getCompanyCd(), updateUserAntisocialStatus.getEntryNo());
        MUserRequest userRequest = mUserRequestRepository.findById(id).orElseThrow(() -> new OkasanHttpException(
            MessagesCodes.VU000002.name(), messageConverter.convert(MessagesCodes.VU000002).getMessage()));
        userRequest.setIdentityDocumentsStatus(updateUserAntisocialStatus.getAntisocialCheckedStatus());
        mUserRequestRepository.save(userRequest);
    }
}
