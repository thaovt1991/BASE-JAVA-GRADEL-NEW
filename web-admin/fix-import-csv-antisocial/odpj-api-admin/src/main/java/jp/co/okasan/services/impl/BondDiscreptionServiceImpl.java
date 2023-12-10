package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.core.utils.CsvExecutorService;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.param.ExportCsvBondsDetailParam;
import jp.co.okasan.domain.response.BondDiscreptionResponse;
import jp.co.okasan.domain.response.ExportCsvBondsDetailResponse;
import jp.co.okasan.domain.response.Product;
import jp.co.okasan.entity.BondDiscreption;
import jp.co.okasan.repositories.BondDiscreptionRepository;
import jp.co.okasan.services.BondDiscreptionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class BondDiscreptionServiceImpl implements BondDiscreptionService {

    private final MessageConverter messageConverter;

    private final BondDiscreptionRepository bondDiscreptionRepository;

    private final CsvExecutorService csvExecutorService;

    @Override
    public ExportCsvBondsDetailResponse exportCsvBondsDetail(ExportCsvBondsDetailParam param) {

        try {

            Optional<BondDiscreption> bondDiscreption = bondDiscreptionRepository.findBondDiscreptionById(String.valueOf(param.getIssueCd()));

            if (bondDiscreption.isPresent()) {
                BondDiscreptionResponse BondDiscreptionResponse = new BondDiscreptionResponse();
                BeanUtils.copyProperties(bondDiscreption.get(), BondDiscreptionResponse);
                ByteArrayResource resource = new ByteArrayResource(csvExecutorService.toBytes(List.of(BondDiscreptionResponse)));

                String fileName = "export-csv-bonds-details";

                String contentType = "text/csv";

                int fileSize = resource.getByteArray().length;

                String fileData = Base64.getEncoder().encodeToString(resource.getByteArray());

                return new ExportCsvBondsDetailResponse(fileName, contentType, fileSize, fileData);
            }
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR, List.of(messageConverter.convert(MessagesCodes.D0000502)));
        } catch (Exception e) {
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR, List.of(messageConverter.convert(MessagesCodes.D0000502)), e);
        }
    }
}
