package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.domain.dto.BranchDTO;
import jp.co.okasan.entity.Branch;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.InsertBranchInfoParam;
import jp.co.okasan.mapper.BranchMapper;
import jp.co.okasan.repositories.BranchRepository;
import jp.co.okasan.services.BranchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jp.co.okasan.domain.request.ExportCsvBranchesRequest;
import jp.co.okasan.domain.response.ExportCsvBranchesResponse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class BranchImpl implements BranchService {

    private final BranchRepository branchRepository;
    private final MessageConverter messageConverter;
    private final static String FILENAME = "branches";

    private final BranchMapper mapper;

    @Override
    @Transactional
    public MessageDetail insertBranchInfo(@NonNull InsertBranchInfoParam param) {
        long checkBranchCdExist = branchRepository.countByBranchCd(param.getBranchCd());
        if (checkBranchCdExist > 0) {
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR, null, messageConverter.convert(MessagesCodes.V0007000));
        }
        try {
            Branch branch = new Branch();
            branch.setBranchCd(param.getBranchCd());
            branch.setBranchNm(param.getBranchNm());
            branchRepository.save(branch);
            return messageConverter.convert(MessagesCodes.C0007000);
        } catch (Exception e) {
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR, List.of(messageConverter.convert(MessagesCodes.D0007500)), e);
        }
    }

    @Override
    public ExportCsvBranchesResponse exportCsvBranches(ExportCsvBranchesRequest param) {
        Optional<Branch> branchOp = branchRepository.findByBranchCdAndExpireFlg(param.getBankCd(), 0);
        if (branchOp.isEmpty()) {
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR, List.of(messageConverter.convert(MessagesCodes.D1001000)), null);
        }
        try {
            String[] headerCsv = {
                    "BRANCH_CD",
                    "BRANCH_NM",
                    "BRANCH_KANA_NM",
                    "EXPIRE_FLG",
                    "BRANCH_KIND_CD",
                    "PLINCIPAL_FLG",
                    "OWN_BRANCH_FLG",
                    "BROKER_CD",
                    "DEFAULT_SALES_CD", "ZIP_NO_1", "ZIP_NO_2",
                    "SEC_CO_ADDRESS1",
                    "SEC_CO_ADDRESS2",
                    "SEC_CO_ADDRESS3",
                    "SEC_CO_ADDRESS4", "INPUT_TM",
                    "CREATE_PRG_ID",
                    "UPDATE_DATETIME",
                    "UPDATE_PRG_ID",
            };
            String[] mappingField = {
                    "branchCd",
                    "branchNm",
                    "branchKanaNm",
                    "expireFlg",
                    "branchKindCd",
                    "plincipalFlg",
                    "ownBranchFlg",
                    "brokerCd",
                    "defaultSalesCd",
                    "zipNo1",
                    "zipNo2",
                    "secCoAddress1",
                    "secCoAddress2",
                    "secCoAddress3",
                    "secCoAddress4",
                    "inputTm",
                    "createPrgId",
                    "updateDatetime",
                    "updatePrgId",
            };
            List<Branch> branches = new ArrayList<>();
            branches.add(branchOp.get());
            DateFormat dateFormatter = new SimpleDateFormat("yyyyMMddHHmmss");
            String currentDateTime = dateFormatter.format(new Date());
            String fileName = FILENAME + "_" + currentDateTime + ".csv";
//            ExportFileCsvService.exportCsvUtils(branches, headerCsv, mappingField, fileName);
//            String dataFile = ExportFileCsvService.encodeFileToBase64(fileName);
//            Long fileSize = ExportFileCsvService.getFileSize(fileName);
            String contentType = "text/csv";
            ExportCsvBranchesResponse exportCsvBranchesResponse = new ExportCsvBranchesResponse(contentType, null, fileName, null);
            return exportCsvBranchesResponse;
        } catch (Exception e) {
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR, List.of(messageConverter.convert(MessagesCodes.E1001000)), e);
        }
    }

    @Override
    public List<BranchDTO> getBranchInfo() {
        List<Branch> listBranch = branchRepository.findAll();
        if (listBranch.isEmpty()) {
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR,List.of(messageConverter.convert(MessagesCodes.D0000500)),null);
        }
        return listBranch.stream().map(mapper::toBranchDto).toList();
    }
}
