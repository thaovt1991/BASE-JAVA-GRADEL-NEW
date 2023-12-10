package jp.co.okasan.mapper;

import jp.co.okasan.domain.dto.BondDiscreptionDTO;
import jp.co.okasan.entity.BondDiscreption;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BondMapper {
    BondDiscreption toDto(BondDiscreptionDTO entity);
    List<BondDiscreption> map(List<BondDiscreptionDTO> contents);
    @InheritInverseConfiguration(name = "toDto")
    void patch(BondDiscreptionDTO dto, @MappingTarget BondDiscreption entity);
}
