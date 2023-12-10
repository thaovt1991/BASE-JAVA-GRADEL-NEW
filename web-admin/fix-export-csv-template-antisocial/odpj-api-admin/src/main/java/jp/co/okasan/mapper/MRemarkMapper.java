package jp.co.okasan.mapper;

import jp.co.okasan.domain.dto.FundPriceDTO;
import jp.co.okasan.domain.response.RemarkDTO;
import jp.co.okasan.entity.FundPrice;
import jp.co.okasan.entity.MRemark;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MRemarkMapper {
    RemarkDTO toDto(MRemark entity);

    MRemark toEntity(RemarkDTO dto);

    List<RemarkDTO> map(List<MRemark> contents);

    @InheritInverseConfiguration(name = "toDto")
    void patch(RemarkDTO dto, @MappingTarget MRemark entity);
}
