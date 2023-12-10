package jp.co.okasan.services;

import jp.co.okasan.domain.request.GetEDocumentsRequest;
import jp.co.okasan.domain.response.EDocumentsResponse;
import org.springframework.lang.NonNull;
import javax.validation.constraints.NotNull;

public interface EDocumentsService {
    //@NotNull EDocumentsResponse getEDocumentsByIssueCd(@NonNull Integer param);
    @NotNull EDocumentsResponse getEDocumentsByIssueCd(@NonNull GetEDocumentsRequest param);
}
