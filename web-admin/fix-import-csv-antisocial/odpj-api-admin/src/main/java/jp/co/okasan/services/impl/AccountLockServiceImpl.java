package jp.co.okasan.services.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.domain.dto.AccountLockDTO;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.param.UpdateLockInfoRequest;
import jp.co.okasan.entity.AccountLock;
import jp.co.okasan.entity.AccountLockHistory;
import jp.co.okasan.entity.AccountLockHistoryPK;
import jp.co.okasan.entity.AccountLockPK;
import jp.co.okasan.mapper.AccountLockMapper;
import jp.co.okasan.mapper.AccountLockToHistory;
import jp.co.okasan.repositories.AccountLockHistoryRepository;
import jp.co.okasan.repositories.AccountLockRepository;
import jp.co.okasan.services.AccountLockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountLockServiceImpl implements AccountLockService {
    private final AccountLockRepository accountLockRepository;
    private final AccountLockHistoryRepository accountLockHistoryRepository;
    private final MessageConverter messageConverter;
    private AccountLockMapper mapper;
    private AccountLockToHistory mapperToHistory;

    /**
     * update account Lock
     *
     * @param request
     * @return
     */
    @Transactional
    @NonNull
    @Override
    public MessageDetail updateLockInfo(@NonNull UpdateLockInfoRequest request) {
        try {
            AccountLock entity = new AccountLock();
            AccountLockHistory accountHistory = new AccountLockHistory();
            AccountLockPK accountId = new AccountLockPK();
            accountId.setBranchCd(request.getBranchCd());
            accountId.setCustomerCd(request.getCustomerCd());

            AccountLockHistoryPK accountHistoryId = new AccountLockHistoryPK();
            accountHistoryId.setAcLockSeqNo(0L);
            accountHistoryId.setBranchCd(request.getBranchCd());
            accountHistoryId.setCustomerCd(request.getCustomerCd());

            Optional<AccountLock> pna = accountLockRepository.findById(accountId);
            AccountLockDTO lockDto = new AccountLockDTO();
            switch (request.getLockType()) {
                case 1:
                    lockDto.setAccLockFlg(request.getLockFlg());
                    lockDto.setAccLockLoginSts(1);
                    lockDto.setAccLockReqSts(1);
                    lockDto.setAccLockTrdSts(2);
                    lockDto.setAccLockReason(request.getLockReason());
                    break;
                case 2:
                    lockDto.setAcLockFlg(request.getLockFlg());
                    lockDto.setAcLockLoginSts(2);
                    lockDto.setAcLockReqSts(2);
                    lockDto.setAcLockTrdSts(2);
                    lockDto.setAcLockReason(request.getLockReason());
                    break;
                default:
                    lockDto.setSsLockFlg(request.getLockFlg());
                    lockDto.setSsLockLoginSts(2);
                    lockDto.setSsLockReqSts(2);
                    lockDto.setSsLockTrdSts(2);
                    lockDto.setSsLockReason(request.getLockReason());
            }
            if (pna.isPresent()) {
                entity = pna.get();
                accountHistory = mapperToHistory.toHistory(entity);
                accountHistory.setId(accountHistoryId);
                accountLockHistoryRepository.save(accountHistory);
            }
            entity = mapper.toEntity(lockDto);
            entity.setId(accountId);
            accountLockRepository.save(entity);
        } catch (
                Exception e) {
            log.error(MessagesCodes.DU000509.name(), e);
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DU000509)),
                    e);
        }
        return messageConverter.convert(MessagesCodes.CU0009);
    }
}
