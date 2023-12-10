package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.dto.BranchDTO;
import jp.co.okasan.domain.request.InsertBranchInfoParam;
import org.springframework.lang.NonNull;
import jp.co.okasan.domain.request.ExportCsvBranchesRequest;
import jp.co.okasan.domain.response.ExportCsvBranchesResponse;

import java.util.List;

public interface BranchService {

    MessageDetail insertBranchInfo(@NonNull InsertBranchInfoParam param);
    ExportCsvBranchesResponse exportCsvBranches(ExportCsvBranchesRequest param);

    List<BranchDTO> getBranchInfo();

}
