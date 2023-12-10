
package jp.co.okasan.mapper;

import jp.co.okasan.domain.dto.PrivilegeInquiryDto;
import jp.co.okasan.entity.BondDiscreption;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PrivilegeInquiryMapper {
    PrivilegeInquiryDto toDto(BondDiscreption entity);
    List<PrivilegeInquiryDto> map(List<BondDiscreption> contents);
    @InheritInverseConfiguration(name = "toDto")
    void patch(PrivilegeInquiryDto dto, @MappingTarget BondDiscreption entity);
}
