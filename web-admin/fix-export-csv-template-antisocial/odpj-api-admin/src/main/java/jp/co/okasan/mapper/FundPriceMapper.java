package jp.co.okasan.mapper;

import jp.co.okasan.domain.dto.FundPriceDTO;
import jp.co.okasan.entity.FundPrice;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FundPriceMapper {

    FundPriceDTO toDto(FundPrice entity);

    FundPrice toEntity(FundPriceDTO dto);

    List<FundPriceDTO> map(List<FundPrice> contents);

    @InheritInverseConfiguration(name = "toDto")
    void patch(FundPriceDTO dto, @MappingTarget FundPrice entity);

}
