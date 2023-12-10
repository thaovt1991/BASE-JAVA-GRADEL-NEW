package jp.co.okasan.domain.response;

import jp.co.okasan.entity.CodeMaster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeMasterResponse {
    private List<CodeMaster> codeMasters;
}
