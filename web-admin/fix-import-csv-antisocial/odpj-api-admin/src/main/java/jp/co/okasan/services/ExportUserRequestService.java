package jp.co.okasan.services;

import jp.co.okasan.domain.request.ExportUserRequest;

public interface ExportUserRequestService {

  byte[] exportUserRequest(ExportUserRequest request);
}
