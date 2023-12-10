package jp.co.okasan.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExportCsvBranchesResponse {

    private String contentType;

    private Long fileSize;

    private String fileName;

    private String dataFile;

}
