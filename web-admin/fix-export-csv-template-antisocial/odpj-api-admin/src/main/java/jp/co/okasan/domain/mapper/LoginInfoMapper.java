package jp.co.okasan.domain.mapper;

import jp.co.okasan.domain.dto.LoginInfoDTO;
import org.mapstruct.Mapper;

import java.util.Map;

@Mapper(componentModel = "spring")
public interface LoginInfoMapper {
    LoginInfoDTO toDto(Map<String, String> source);
}
