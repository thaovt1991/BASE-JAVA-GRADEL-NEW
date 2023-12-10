package jp.co.okasan.domain.mapper;

import jp.co.okasan.domain.response.ExportUserItemResponse;
import jp.co.okasan.entity.MUserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExportUserRequestMapper {

    ExportUserItemResponse toExportUserItemResponse(MUserRequest item);

}
