package jp.co.okasan.repositories;

import jp.co.okasan.domain.request.SearchUserRequest;
import jp.co.okasan.domain.response.SearchUserRequestResponse;

import java.text.ParseException;
import java.util.List;

public interface UserCustomRepository {
    List<SearchUserRequestResponse> searchUserReqInfos(SearchUserRequest userRequestDate, String fromDate, String toDate, Integer pageIndex, Integer pageSize) throws ParseException;
}
