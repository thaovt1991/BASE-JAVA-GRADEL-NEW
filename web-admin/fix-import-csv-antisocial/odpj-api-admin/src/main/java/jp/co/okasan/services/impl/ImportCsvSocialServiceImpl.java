package jp.co.okasan.services.impl;


import com.sun.xml.bind.v2.TODO;
import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ReadFileCsvResult;
import jp.co.okasan.core.utils.CsvImportHelper;
import jp.co.okasan.domain.dto.MAntiSocialForcesDTO;
import jp.co.okasan.domain.response.ImportCsvAntisocialResponse;
import jp.co.okasan.entity.MAntiSocialForces;
import jp.co.okasan.exception.OkasanHttpException;
import jp.co.okasan.mapper.MAntiSocialForcesMapper;
import jp.co.okasan.repositories.MAntiSocialForcesRepository;
import jp.co.okasan.services.ImportCsvAntiSocialService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Slf4j
public class ImportCsvSocialServiceImpl implements ImportCsvAntiSocialService {
    private final MAntiSocialForcesRepository mAntiSocialForcesRepository;
    private final CsvImportHelper<MAntiSocialForcesDTO> csvImportHelper;
    private final MessageConverter messageConverter;
    private final MAntiSocialForcesMapper mapper;

    @Override
    public ImportCsvAntisocialResponse importAntiSocialForces(MultipartFile file) {
        if (file == null || file.isEmpty()) {
            throw new OkasanHttpException("EU000002");
        }
        //TODO: function to find confirmationCd ???
        //TODO: function csvImportHelper import csv can not work???
        try {
            InputStream is = file.getInputStream();
            byte[] bytes = is.readAllBytes();
            String data = Base64.getEncoder().encodeToString(bytes);
            String contentType = "text/csv";
            int fileSize = bytes.length;
            String fileName = "import-csv-antisocial";
            ReadFileCsvResult result = csvImportHelper.readCsvFromInputStream(MAntiSocialForcesDTO.class, is);
            if (result != null && result.isStatus() && !ObjectUtils.isEmpty(result.getObject())) {
                List<MAntiSocialForces> list = ((List<MAntiSocialForcesDTO>) result.getObject()).stream()
                        .map(mapper::toAntiSocialForces).collect(Collectors.toList());
                list.forEach(t -> {
                    t.setUpdateDt(LocalDateTime.now());
                });
                mAntiSocialForcesRepository.saveAll(list);
                return new ImportCsvAntisocialResponse(contentType, fileName, data, fileSize);
            } else {
                throw new OkasanHttpException("EU00002");
            }
        } catch (Exception e) {
            log.info("Can not import csv: " + e.getMessage());
            throw new OkasanHttpException("EU00002");
        }

    }
}
