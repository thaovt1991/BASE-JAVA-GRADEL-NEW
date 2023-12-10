package jp.co.okasan.mapper;

import jp.co.okasan.domain.dto.RoleInfoDTO;
import jp.co.okasan.entity.RoleInfo;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.ReportingPolicy.IGNORE;


@Mapper(unmappedTargetPolicy = IGNORE, nullValueCheckStrategy = ALWAYS)
public interface RoleInfoMapper {

	RoleInfoMapper INSTANCE = Mappers.getMapper(RoleInfoMapper.class);

	@Mappings({
		@Mapping(source = "id", target = "roleCd"),
		@Mapping(source = "roleNm", target = "roleName")
	})
	RoleInfoDTO toDto(RoleInfo entity);

	RoleInfo toEntity(RoleInfoDTO dto);

	List<RoleInfoDTO> map(List<RoleInfo> entities);

	@InheritInverseConfiguration(name = "toDto")
	void patch(RoleInfoDTO dto, @MappingTarget RoleInfo entity);
	
}
