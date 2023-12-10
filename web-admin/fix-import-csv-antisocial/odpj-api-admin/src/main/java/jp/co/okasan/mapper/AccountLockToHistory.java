package jp.co.okasan.mapper;

import jp.co.okasan.entity.AccountLock;
import jp.co.okasan.entity.AccountLockHistory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountLockToHistory {
    @Mapping(target = "acLockSeqNo", ignore = true)
    AccountLockHistory toHistory(AccountLock entity);
}
