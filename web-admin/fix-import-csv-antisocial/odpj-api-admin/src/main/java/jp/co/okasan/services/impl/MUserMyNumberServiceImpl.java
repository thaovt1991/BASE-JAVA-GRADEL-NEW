package jp.co.okasan.services.impl;

import jp.co.okasan.domain.request.UpdateMyNumberRequest;
import jp.co.okasan.mapper.UpdateMyNumberMapper;
import jp.co.okasan.repositories.MUserMyNumberRepository;
import jp.co.okasan.services.MUserMyNumberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MUserMyNumberServiceImpl implements MUserMyNumberService {
    private final MUserMyNumberRepository mUserMyNumberRepository;
    private final UpdateMyNumberMapper mapper;

    @Override
    @Transactional
    public void updateMyNumber(UpdateMyNumberRequest request) {
            //TODO: Confirmation_no ???
            mUserMyNumberRepository.save(mapper.toMUserMyNumber(request));
    }
}
