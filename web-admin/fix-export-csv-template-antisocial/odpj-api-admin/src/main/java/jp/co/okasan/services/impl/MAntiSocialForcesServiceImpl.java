package jp.co.okasan.services.impl;

import java.util.Optional;
import jp.co.okasan.domain.request.GetAntisocialForcesParam;
import jp.co.okasan.entity.MAntiSocialForces;
import jp.co.okasan.entity.MAntiSocialForcesPK;
import jp.co.okasan.repositories.MAntisocialForcesRepository;
import jp.co.okasan.services.MAntiSocialForcesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MAntiSocialForcesServiceImpl implements MAntiSocialForcesService {

    private final MAntisocialForcesRepository mAntisocialForcesRepository;

    @Override
    public Optional<MAntiSocialForces> getAntisocialForces(GetAntisocialForcesParam param) {

        return mAntisocialForcesRepository.findById(
          new MAntiSocialForcesPK(param.getCompanyCd(), param.getEntryNo()));
    }
}
