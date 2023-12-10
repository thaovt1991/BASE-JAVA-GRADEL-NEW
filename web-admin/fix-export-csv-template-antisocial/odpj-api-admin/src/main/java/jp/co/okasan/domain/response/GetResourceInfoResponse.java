package jp.co.okasan.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.domain.dto.ResouceInfoDto;
import jp.co.okasan.entity.Client;
import jp.co.okasan.entity.Yoryoku;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
public class GetResourceInfoResponse {
    private Long total;
    private List<Yoryoku> resource;
}
