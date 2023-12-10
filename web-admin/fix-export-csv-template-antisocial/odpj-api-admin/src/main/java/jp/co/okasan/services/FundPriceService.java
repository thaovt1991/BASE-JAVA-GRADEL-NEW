package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.dto.FundPriceDTO;
import jp.co.okasan.domain.request.UpdateFundDividendPrice;
import jp.co.okasan.domain.request.UpdateFundStdPriceParam;
import jp.co.okasan.domain.response.ExportCsvBondsDetailResponse;
import jp.co.okasan.search.FundPriceSearchCriteria;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface FundPriceService {
    ExportCsvBondsDetailResponse exportCsv(FundPriceSearchCriteria searchCriteria);

    @NotNull MessageDetail updateFundStdPrice(@NonNull UpdateFundStdPriceParam param);

    List<FundPriceDTO> search(FundPriceSearchCriteria searchCriteria);

    FundPriceDTO updateFundDividendPrice(UpdateFundDividendPrice model);
}
