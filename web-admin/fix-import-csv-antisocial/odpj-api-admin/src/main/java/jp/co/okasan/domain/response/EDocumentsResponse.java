package jp.co.okasan.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.entity.MokuromisyoInfo;
import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class EDocumentsResponse {
    @JsonProperty("documents")
    List<MokuromisyoInfo> MokuromisyoInfos;
}
