package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.SearchUserRequest;
import jp.co.okasan.domain.response.SearchUserRequestResponse;
import jp.co.okasan.entity.MUserRequestImage;
import jp.co.okasan.repositories.UserCustomRepository;
import jp.co.okasan.repositories.UserRequestImageRepository;
import jp.co.okasan.services.UserService;
import jp.co.okasan.utils.DateFormatUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRequestImageRepository userRequestImageRepository;
    private final MessageConverter messageConverter;

    private final UserCustomRepository userCustomRepository;

    @NonNull
    @Override
    public MessageDetail addRequestImage(@NonNull MUserRequestImage image) {
        try {
            userRequestImageRepository.save(image);
        } catch (Exception e) {
            log.error(MessagesCodes.DI000005.name(), e);
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DI000005)),
                    e);
        }
        return messageConverter.convert(MessagesCodes.CI0005);
    }

    @Override
    public ApiResponse searchUserRequest(SearchUserRequest searchUserRequest) {
        try {
            DateFormatUtil.dateFormatter(searchUserRequest.getFromDate());
            DateFormatUtil.dateFormatter(searchUserRequest.getToDate());
            List<SearchUserRequestResponse> userReqInfos = userCustomRepository.searchUserReqInfos(searchUserRequest, searchUserRequest.getFromDate(), searchUserRequest.getToDate(), 1, 10);
            return ApiResponse.builder()
                    .result(ResponseResult.builder()
                            .data(userReqInfos).build())
                    .build();
        } catch (ParseException e) {
            log.error(MessagesCodes.DI000005.name(), e);
            return ApiResponse.builder().httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).exception(e.getMessage())
                    .result(ResponseResult.builder()
                            .messages(List.of(messageConverter.convert(MessagesCodes.SU000002))).build()).build();
        } catch (Exception e) {
            return ApiResponse.builder().httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).exception(e.getMessage())
                    .result(ResponseResult.builder()
                            .messages(List.of(messageConverter.convert(MessagesCodes.DU000002))).build()).build();
        }
    }

}
