package jp.co.okasan.services.impl;

import jp.co.okasan.domain.response.RemarkDTO;
import jp.co.okasan.entity.MRemark;
import jp.co.okasan.entity.MRemarkPK;
import jp.co.okasan.exception.OkasanHttpException;
import jp.co.okasan.mapper.MRemarkMapper;
import jp.co.okasan.repositories.MRemarkRepository;
import jp.co.okasan.services.MRemarkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class MRemarkServiceImpl implements MRemarkService {
    private final MRemarkRepository mRemarkRepository;

    @Override
    public MRemark findByCompanyCdAndEntryNoAndInRouterCls(String companyCd, Integer entryNo, String inputRouteCls) {
        MRemarkPK id = new MRemarkPK(companyCd, entryNo, inputRouteCls);
        MRemark remark = mRemarkRepository.findById(id).orElseThrow(
                () -> {
                    log.debug("could not find remark id = {}", id);
                    return new OkasanHttpException("DM000001");
                });
//        if (remarks.isEmpty()) {
//            throw new OkasanHttpException("DM000001");
//        }
//        RemarkDTO itemResponse = mapper.toDto(remarks.get());
        return remark;
    }
}
