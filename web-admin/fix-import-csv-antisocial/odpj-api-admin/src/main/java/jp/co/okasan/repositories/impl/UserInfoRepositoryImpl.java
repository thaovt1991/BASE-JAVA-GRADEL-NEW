package jp.co.okasan.repositories.impl;

import static jp.co.okasan.config.Constants.DELETE_FLAG_FALSE;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import jp.co.okasan.domain.dto.UserInfoDTO;
import jp.co.okasan.domain.request.UserInfoParam;
import jp.co.okasan.entity.QCorporateInfo;
import jp.co.okasan.entity.QUserInfo;
import jp.co.okasan.entity.UserInfo;
import jp.co.okasan.repositories.base.BaseRepositoryCustom;
import jp.co.okasan.repositories.base.QueryBuilder;
import jp.co.okasan.repositories.custom.UserInfoRepositoryCustom;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

@Repository
public class UserInfoRepositoryImpl extends BaseRepositoryCustom
    implements UserInfoRepositoryCustom {

  @Override
  public Page<UserInfoDTO> getUserInfo(UserInfoParam userInfoParam) {
    QUserInfo qUserInfo = QUserInfo.userInfo;
    QCorporateInfo qCorporateInfo = QCorporateInfo.corporateInfo;

    // TODO [Nguyen Thanh] [322] Add item O-30, O-31, O-32
    JPAQuery<UserInfoDTO> q = new JPAQuery(em);
    var query = q.from(qUserInfo)
        .leftJoin(qCorporateInfo).on(qUserInfo.id.corpCd.eq(qCorporateInfo.companyCd))
        .where(wherePredicate(userInfoParam, qUserInfo))
        .select(Projections.constructor(
            UserInfoDTO.class,
            qUserInfo.roleCd,
            qUserInfo.id.userCd,
            qUserInfo.userNm,
            qUserInfo.userNmKana,
            qUserInfo.branchCd,
            qUserInfo.traderCd,
            qUserInfo.pinNo,
            qCorporateInfo.secCoNm,
            qCorporateInfo.participantNm
        ));

    return fetch(queryDsl(UserInfo.class), query, userInfoParam.pageRequest());
  }

  private Predicate wherePredicate(UserInfoParam userInfoParam, QUserInfo qUserInfo) {
    QueryBuilder wherePredicate = QueryBuilder.newQueryBuilder();
    wherePredicate.and(qUserInfo.deleteFlag.eq(DELETE_FLAG_FALSE));

    if (!userInfoParam.getSearchFlg()) {
      return wherePredicate;
    }

    wherePredicate.eqIfProvided(qUserInfo.id.userCd, userInfoParam.getUserCd());

    if (!StringUtils.isEmpty(userInfoParam.getUserNm())) {
      var userNmLike = qUserInfo.userNm.likeIgnoreCase(
          getValueLike(userInfoParam.getUserNm().toLowerCase()));
      var userNmKanaLike = qUserInfo.userNmKana.likeIgnoreCase(
          getValueLike(userInfoParam.getUserNm().toLowerCase()));
      wherePredicate.and(userNmLike.or(userNmKanaLike));
    }

    return wherePredicate;
  }
}
