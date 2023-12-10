package jp.co.okasan.services.impl;

import jp.co.okasan.entity.MNameIdentification;
import jp.co.okasan.repositories.MNameIdentificationRepository;
import jp.co.okasan.services.MNameIdentificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class MNameIdentificationServiceImpl implements MNameIdentificationService {

    private final MNameIdentificationRepository nameIdentificationRepository;

    @Override
    public List<MNameIdentification> findAllByEntryNoAndClientNo(Integer entryNo, Integer clientNo) {
        return nameIdentificationRepository.findAllByEntryNoAndClientNo(entryNo, clientNo);
    }
}
