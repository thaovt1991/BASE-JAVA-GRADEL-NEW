package jp.co.okasan.mapper;

import jp.co.okasan.domain.request.UpdateMyNumberRequest;
import jp.co.okasan.entity.MUserMyNumber;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UpdateMyNumberMapper {

    MUserMyNumber toMUserMyNumber(UpdateMyNumberRequest request);
}
