package jp.co.okasan.services.impl;

import jp.co.okasan.core.utils.AppConstants;
import jp.co.okasan.domain.param.UpdateUserRequestImageParam;
import jp.co.okasan.entity.MUserRequestImage;
import jp.co.okasan.mapper.UserRequestImageMapper;
import jp.co.okasan.repositories.MUserRequestImageRepository;
import jp.co.okasan.services.MUserRequestImageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Slf4j
@RequiredArgsConstructor
public class MUserRequestImageServiceImpl implements MUserRequestImageService {
    private final MUserRequestImageRepository mUserRequestImageRepository;
    private final UserRequestImageMapper mapper;

    @Override
    @Transactional
    public void updateUserRequestImageResponse(UpdateUserRequestImageParam param) {
        MUserRequestImage image = new MUserRequestImage();
        image= mapper.toEntity(param);
        image.setCompanyCd(AppConstants.COMPANY_CD_DEFAULT);
        // TODO [HanPhan] remove these. It will be moved to JPA Audit
        image.setCreateDt(LocalDateTime.now());
        image.setUpdateDt(LocalDateTime.now());
        mUserRequestImageRepository.save(image);
    }
}
