package jp.co.okasan.services;

import jp.co.okasan.domain.response.ImportCsvAntisocialResponse;
import org.springframework.web.multipart.MultipartFile;

public interface ImportCsvAntiSocialService {

  ImportCsvAntisocialResponse importAntiSocialForces(MultipartFile file);
}
