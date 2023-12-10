package jp.co.okasan.domain.response;

import jp.co.okasan.domain.dto.AccountLockDTO;
import jp.co.okasan.domain.dto.AccountLockHistoryDTO;
import jp.co.okasan.domain.dto.ClientDTO;
import jp.co.okasan.domain.dto.GsSysLogDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetLockInfoResponse {

    private ClientDTO customerInfo;

    private AccountLockDTO accountLock;

    private List<AccountLockHistoryDTO> accountLockHistory;

    private List<GsSysLogDTO> gsSysLog;
}
