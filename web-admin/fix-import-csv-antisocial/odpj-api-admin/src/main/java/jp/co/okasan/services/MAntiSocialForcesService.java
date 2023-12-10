package jp.co.okasan.services;

import java.util.Optional;
import jp.co.okasan.domain.request.GetAntisocialForcesParam;
import jp.co.okasan.entity.MAntiSocialForces;

public interface MAntiSocialForcesService {

    Optional<MAntiSocialForces> getAntisocialForces(GetAntisocialForcesParam param);
}
