package jp.co.okasan.services.impl;

import java.util.List;
import java.util.Map;
import jp.co.okasan.domain.dto.LoginInfoDTO;
import jp.co.okasan.domain.mapper.LoginInfoMapper;
import jp.co.okasan.repositories.LoginInfoRepository;
import jp.co.okasan.services.LoginInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LoginInfoServiceImpl implements LoginInfoService {
  private final LoginInfoRepository loginInfoRepository;
  private final LoginInfoMapper loginInfoMapper;
  @Override
  @Transactional(readOnly = true)
  public LoginInfoDTO getUserInfo(int customerCd) {
    try {
      List<Map<String, String>> userReqInfos = loginInfoRepository.getUserInfo(customerCd);
      if (userReqInfos.size() == 0) {
        return null;
      }
      return loginInfoMapper.toDto(userReqInfos.get(0));
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
