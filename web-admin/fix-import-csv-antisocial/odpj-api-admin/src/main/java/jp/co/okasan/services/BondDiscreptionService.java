package jp.co.okasan.services;

import jp.co.okasan.domain.param.ExportCsvBondsDetailParam;
import jp.co.okasan.domain.response.ExportCsvBondsDetailResponse;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

public interface BondDiscreptionService {

    @NotNull ExportCsvBondsDetailResponse exportCsvBondsDetail(@NonNull ExportCsvBondsDetailParam param);
}
