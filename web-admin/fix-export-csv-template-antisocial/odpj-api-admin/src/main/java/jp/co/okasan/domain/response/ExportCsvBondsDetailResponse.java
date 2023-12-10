package jp.co.okasan.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExportCsvBondsDetailResponse {

    private String fileName;

    private String contentType;

    private int fileSize;

    private String fileData;
}
