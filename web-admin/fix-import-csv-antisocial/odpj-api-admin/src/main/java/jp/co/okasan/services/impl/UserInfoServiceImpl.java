package jp.co.okasan.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import jp.co.okasan.config.Constants;
import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.dto.RoleInfoDTO;
import jp.co.okasan.domain.dto.UserInfoDTO;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.SaveUserRequest;
import jp.co.okasan.domain.request.UserInfoParam;
import jp.co.okasan.domain.response.GetFormSaveUserResponse;
import jp.co.okasan.entity.UserInfo;
import jp.co.okasan.entity.UserInfoPK;
import jp.co.okasan.mapper.RoleInfoMapper;
import jp.co.okasan.mapper.UserInfoMapper;
import jp.co.okasan.repositories.RoleInfoRepository;
import jp.co.okasan.repositories.UserInfoRepository;
import jp.co.okasan.services.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService {

  private final UserInfoRepository userInfoRepository;
  private final RoleInfoRepository roleInfoRepository;
  private final MessageConverter messageConverter;

  @Override
  @Transactional(readOnly = true)
  public Page<UserInfoDTO> getUserInfo(UserInfoParam userInfoParam) {
    return userInfoRepository.getUserInfo(userInfoParam);
  }

  @Override
  public GetFormSaveUserResponse getFormSaveUser() {
    List<RoleInfoDTO> roleInfoDTOList = RoleInfoMapper.INSTANCE.map(roleInfoRepository.findAll());
    return GetFormSaveUserResponse.builder().roleInfo(roleInfoDTOList).build();
  }

  @Override
  @Transactional(readOnly = true)
  public MessageDetail saveUser(SaveUserRequest request) {
    var userInfoPK = new UserInfoPK(Integer.parseInt(request.getUserCd()), request.getCorpCd());
    Optional<UserInfo> userInfoOptional = userInfoRepository.findById(userInfoPK);

    if (Constants.DELETE_FLAG_YES.toString().equals(request.getDeleteFlg())) {
      if (userInfoOptional.isPresent()) {
        var userInfo = userInfoOptional.get();
        userInfo.setDeleteFlag(Constants.DELETE_FLAG_FALSE);

        userInfoRepository.save(userInfo);

        // TODO [TQVu][QA-No8] Confirming message save user success
        return messageConverter.convert(MessagesCodes.CI0005);
      }
      // TODO [TQVu][QA-No6] Confirming message when deleteFlag = 1 and user does not exist.
    }

    var userInfo = UserInfoMapper.INSTANCE.toEntity(request);
    userInfo.setId(userInfoPK);
    // TODO [TQVu] [QA-No5] Confirming default values
    // TODO [TQVu] Waiting implement login for get current user login.
    if (userInfoOptional.isPresent()) {
      userInfo.setUpdateUserCd(12345);
      userInfo.setUpdateDt(new Date());
    } else {
      userInfo.setCreateUserCd(12345);
      userInfo.setCreateDt(new Date());
    }
    userInfoRepository.save(userInfo);

    // TODO [TQVu][QA-No8] Confirming message save user success
    return messageConverter.convert(MessagesCodes.CI0005);
  }
}
