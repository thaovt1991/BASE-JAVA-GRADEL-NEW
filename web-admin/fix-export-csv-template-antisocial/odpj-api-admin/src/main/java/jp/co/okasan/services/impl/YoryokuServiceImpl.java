package jp.co.okasan.services.impl;

import jp.co.okasan.domain.response.GetResourceInfoResponse;
import jp.co.okasan.entity.Yoryoku;
import jp.co.okasan.domain.request.GetResourceInfoRequest;
import jp.co.okasan.repositories.YoryokuReponsitory;
import jp.co.okasan.services.YoryokuService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class YoryokuServiceImpl implements YoryokuService {
    private final YoryokuReponsitory yoryokuReponsitory;
    @Override
    public GetResourceInfoResponse getResourceInfo(@NonNull GetResourceInfoRequest param) {
        GetResourceInfoResponse result = new GetResourceInfoResponse();
        Pageable pageable = PageRequest.of(param.getPageNumber()==null?(param.getPageNumber()-1):0, param.getPageSize());
        Page<Yoryoku> yoryokuPage = yoryokuReponsitory.findClientByBranchCdAndCustomerCd(
                param.getBranchCd(), param.getCustomerCd(), pageable);
        result.setTotal(yoryokuPage.getTotalElements());
        result.setResource(yoryokuPage.getContent());
        return result;
    }
}
