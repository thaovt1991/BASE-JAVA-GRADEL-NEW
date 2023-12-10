package jp.co.okasan.mapper;

import jp.co.okasan.domain.request.SaveUserRequest;
import jp.co.okasan.entity.UserInfo;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.ReportingPolicy.IGNORE;


@Mapper(unmappedTargetPolicy = IGNORE, nullValueCheckStrategy = ALWAYS)
public interface UserInfoMapper {

	UserInfoMapper INSTANCE = Mappers.getMapper(UserInfoMapper.class);

	SaveUserRequest toDto(UserInfo entity);

	UserInfo toEntity(SaveUserRequest param);

	List<SaveUserRequest> map(List<UserInfo> entities);

	@InheritInverseConfiguration(name = "toDto")
	void patch(SaveUserRequest param, @MappingTarget UserInfo entity);

}
