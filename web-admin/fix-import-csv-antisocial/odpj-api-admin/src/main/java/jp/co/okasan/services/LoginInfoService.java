package jp.co.okasan.services;

import jp.co.okasan.domain.dto.LoginInfoDTO;

public interface LoginInfoService {
  public LoginInfoDTO getUserInfo(int customerCd);
}
