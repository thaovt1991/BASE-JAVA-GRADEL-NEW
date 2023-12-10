package jp.co.okasan.services;

import jp.co.okasan.domain.param.UpdateUserAntisocialStatusRequest;
import jp.co.okasan.domain.param.UpdateUserIdentifiStatusRequest;

public interface MUserRequestService {

    void updateUserIdentifyStatus(UpdateUserIdentifiStatusRequest updateUserIdentification);

    void updateUserAntiSocialStatus(UpdateUserAntisocialStatusRequest updateUserAntisocialStatus);
}
