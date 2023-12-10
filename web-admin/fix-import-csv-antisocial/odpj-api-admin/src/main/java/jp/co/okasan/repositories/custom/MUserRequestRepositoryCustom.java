package jp.co.okasan.repositories.custom;

import jp.co.okasan.domain.request.ExportUserRequest;
import jp.co.okasan.domain.response.ExportUserItemResponse;
import org.springframework.data.domain.Page;

public interface MUserRequestRepositoryCustom {

    Page<ExportUserItemResponse> findUserRegister(ExportUserRequest request);

}
