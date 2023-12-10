package jp.co.okasan.services;

import jp.co.okasan.domain.request.ExportUserRequest;

public interface ExportCsvTemplateAntiSocialService {

    byte[] ExportCsvTemplateAntiSocial(ExportUserRequest request);
}
