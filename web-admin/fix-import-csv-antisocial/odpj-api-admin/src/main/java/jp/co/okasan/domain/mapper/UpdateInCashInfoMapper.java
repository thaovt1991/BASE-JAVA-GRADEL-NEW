package jp.co.okasan.domain.mapper;

import jp.co.okasan.entity.InCashInfo;
import jp.co.okasan.domain.request.UpdateCashInfoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UpdateInCashInfoMapper {
    UpdateInCashInfoMapper INSTANCE = Mappers.getMapper(UpdateInCashInfoMapper.class );
    @Mapping(target = "id.inputDate",source = "updateCashInfoRequest.inputDate")
    @Mapping(target = "id.fileProcTm",source = "updateCashInfoRequest.fileProcTm")
    @Mapping(target = "id.inCashNo",source = "updateCashInfoRequest.inCashNo")
    InCashInfo toDTO(UpdateCashInfoRequest updateCashInfoRequest);
}
