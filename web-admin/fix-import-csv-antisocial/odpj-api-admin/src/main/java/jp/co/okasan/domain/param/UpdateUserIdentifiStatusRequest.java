package jp.co.okasan.domain.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserIdentifiStatusRequest {
    private String companyCd;
    private Integer entryNo;
    private String identityDocumentsStatus;
}
