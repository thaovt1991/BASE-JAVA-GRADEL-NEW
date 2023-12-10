package jp.co.okasan.mapper;

import jp.co.okasan.domain.dto.AccountLockDTO;
import jp.co.okasan.entity.AccountLock;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountLockMapper {
    AccountLockDTO toDto(AccountLock entity);
    AccountLock toEntity(AccountLockDTO dto);
    @InheritInverseConfiguration(name = "toDto")
    void patch(AccountLockDTO dto, @MappingTarget AccountLock entity);
}
