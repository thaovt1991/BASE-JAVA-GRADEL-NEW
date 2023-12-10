package jp.co.okasan.mapper;

import jp.co.okasan.domain.dto.MAntiSocialForcesDTO;
import jp.co.okasan.entity.MAntiSocialForces;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MAntiSocialForcesMapper {

    MAntiSocialForces toAntiSocialForces(MAntiSocialForcesDTO mAntiSocialForcesDTO);
}
