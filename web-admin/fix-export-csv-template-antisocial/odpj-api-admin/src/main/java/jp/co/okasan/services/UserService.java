package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.request.SearchUserRequest;
import jp.co.okasan.entity.MUserRequestImage;
import org.springframework.lang.NonNull;

import java.text.ParseException;

public interface UserService {

    /**
     * add user's request image
     *
     * @param image image info
     */
    @NonNull
    MessageDetail addRequestImage(@NonNull MUserRequestImage image);

    ApiResponse searchUserRequest(SearchUserRequest SearchUserRequest) throws ParseException;

}
