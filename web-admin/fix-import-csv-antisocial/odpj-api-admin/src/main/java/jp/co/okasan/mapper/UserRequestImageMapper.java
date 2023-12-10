package jp.co.okasan.mapper;

import jp.co.okasan.domain.param.UpdateUserRequestImageParam;
import jp.co.okasan.domain.request.UpdateBranchInfoParam;
import jp.co.okasan.entity.MUserRequestImage;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserRequestImageMapper {
    UpdateUserRequestImageParam toParam(MUserRequestImage entity);
    MUserRequestImage toEntity(UpdateUserRequestImageParam param);
    @InheritInverseConfiguration(name = "toParam")
    void patch(UpdateUserRequestImageParam param, @MappingTarget MUserRequestImage entity);
}
