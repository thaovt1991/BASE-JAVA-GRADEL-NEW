package jp.co.okasan.services;

import jp.co.okasan.entity.MNameIdentification;

import java.util.List;

public interface MNameIdentificationService {

    List<MNameIdentification> findAllByEntryNoAndClientNo(Integer entryNo, Integer clientNo);
}
