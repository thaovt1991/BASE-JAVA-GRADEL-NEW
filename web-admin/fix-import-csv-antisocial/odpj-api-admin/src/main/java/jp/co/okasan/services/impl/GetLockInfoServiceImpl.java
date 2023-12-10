package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.entity.AccountLock;
import jp.co.okasan.entity.AccountLockHistory;
import jp.co.okasan.entity.Client;
import jp.co.okasan.entity.GsSysLog;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.mapper.GetLockInfoMapper;
import jp.co.okasan.domain.request.GetLockInfoParam;
import jp.co.okasan.domain.response.GetLockInfoResponse;
import jp.co.okasan.repositories.AccountLockHistoryRepository;
import jp.co.okasan.repositories.AccountLockRepository;
import jp.co.okasan.repositories.ClientRepository;
import jp.co.okasan.repositories.GsSysLogRepository;
import jp.co.okasan.services.GetLockInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetLockInfoServiceImpl implements GetLockInfoService {

    private final ClientRepository clientRepository;

    private final AccountLockRepository accountLockRepository;

    private final AccountLockHistoryRepository accountLockHistoryRepository;

    private final GsSysLogRepository gsSysLogRepository;

    private final MessageConverter messageConverter;

    private final GetLockInfoMapper mapper;

    @Override
    public GetLockInfoResponse getLockInfo(@NonNull GetLockInfoParam param) {
        try {

            Optional<Client> client = clientRepository.findClientByBranchCdAndCustomerCd(param.getBranchCd(), param.getCustomerCd());

            Optional<AccountLock> accountLock = accountLockRepository.findAccountLockByBranchCdAndCustomerCd(param.getBranchCd(), param.getCustomerCd());

            List<AccountLockHistory> accountLockHistory = accountLockHistoryRepository.findAccountLockHistoriesByBranchCdAndCustomerCd(param.getBranchCd(), param.getCustomerCd());

            List<GsSysLog> gsSysLogList = gsSysLogRepository.findGsSysLogByBranchCd(param.getBranchCd());

            System.out.println("client:" + mapper.toClientDto(client.get()));

            return new GetLockInfoResponse(mapper.toClientDto(client.get()),mapper.toAccountLockDto(accountLock.get()),
                    mapper.toAccountLockHistoryDtos(accountLockHistory), mapper.toGsSysLogDtos(gsSysLogList));



        } catch (Exception e) {
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.RUW404)),
                    e
            );
        }
    }
}
