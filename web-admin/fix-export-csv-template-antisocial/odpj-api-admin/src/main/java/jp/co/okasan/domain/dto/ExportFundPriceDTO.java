package jp.co.okasan.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExportFundPriceDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("content_type")
    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("file_size")
    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("file_name")
    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("data_file")
    private String dataFile;

    public ExportFundPriceDTO(String fileName, String contentType, Long fileSize, String dataType) {
        this.fileName = fileName;
        this.contentType = contentType;
        this.fileSize = fileSize;
        this.dataFile = dataType;
    }

    public ExportFundPriceDTO(String contentType, String fileName) {
        this.contentType = contentType;
        this.fileName = fileName;
    }
}
