package jp.co.okasan.domain.mapper;

import jp.co.okasan.domain.dto.AccountLockDTO;
import jp.co.okasan.domain.dto.AccountLockHistoryDTO;
import jp.co.okasan.domain.dto.ClientDTO;
import jp.co.okasan.domain.dto.GsSysLogDTO;
import jp.co.okasan.entity.AccountLock;
import jp.co.okasan.entity.AccountLockHistory;
import jp.co.okasan.entity.Client;
import jp.co.okasan.entity.GsSysLog;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GetLockInfoMapper {

    ClientDTO toClientDto(Client client);

    AccountLockDTO toAccountLockDto(AccountLock accountLock);

    List<AccountLockHistoryDTO> toAccountLockHistoryDtos(List<AccountLockHistory> accountLockHistoryList);

    List<GsSysLogDTO> toGsSysLogDtos(List<GsSysLog> gsSysLogList);

}
