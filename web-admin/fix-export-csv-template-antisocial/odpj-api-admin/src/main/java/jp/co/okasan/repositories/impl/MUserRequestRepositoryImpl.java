package jp.co.okasan.repositories.impl;

import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
import jp.co.okasan.domain.request.ExportUserRequest;
import jp.co.okasan.domain.response.ExportUserItemResponse;
import jp.co.okasan.entity.MUserRequest;
import jp.co.okasan.entity.QMUserRequest;
import jp.co.okasan.entity.QMUserRequestEmail;
import jp.co.okasan.repositories.base.BaseRepositoryCustom;
import jp.co.okasan.repositories.base.QueryBuilder;
import jp.co.okasan.repositories.custom.MUserRequestRepositoryCustom;
import jp.co.okasan.specification.CommonUtil;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Repository
public class MUserRequestRepositoryImpl extends BaseRepositoryCustom implements MUserRequestRepositoryCustom {
    @Override
    public Page<ExportUserItemResponse> findUserRegister(ExportUserRequest request) {

        var query = createQuery(request);

        return fetch(queryDsl(MUserRequest.class), query, request.pageRequest());
    }

    private JPAQuery<ExportUserItemResponse> createQuery(ExportUserRequest request) {
        QMUserRequest qmUserRequest = QMUserRequest.mUserRequest;
        QMUserRequestEmail qmUserRequestEmail = QMUserRequestEmail.mUserRequestEmail;
        JPAQuery<ExportUserItemResponse> q = new JPAQuery<>(em);
        return q.from(qmUserRequest)
                .where(wherePredicate(request, qmUserRequest, qmUserRequestEmail))
                .innerJoin(qmUserRequestEmail).on(qmUserRequest.entryNo.eq(qmUserRequestEmail.entryNo));

    }

    private Predicate wherePredicate(ExportUserRequest request, QMUserRequest qmUserRequest, QMUserRequestEmail qmUserRequestEmail) {
        LocalDateTime iFromDateTime = null;
        if (request.getFromDate() != null && request.getFromTime() != null) {
            iFromDateTime = request.getFromDate().atTime(request.getFromTime());
        } else if(request.getFromDate() == null && request.getFromTime() != null) {
            iFromDateTime = LocalDate.now().atTime(request.getFromTime());
        } else if(request.getFromDate() != null && request.getFromTime() == null){
            iFromDateTime = request.getFromDate().atTime(LocalTime.of(23, 59, 59));
        }

        LocalDateTime iToDateTime = null;
        if (request.getToDate() != null && request.getToTime() != null) {
            iToDateTime = request.getToDate().atTime(request.getToTime());
        } else if(request.getToDate() == null && request.getToTime() != null) {
            iToDateTime = LocalDate.now().atTime(request.getToTime());
        } else if(request.getToDate() != null && request.getToTime() == null){
            iToDateTime = request.getToDate().atTime(LocalTime.of(23, 59, 59));
        }
        String birthYear = CommonUtil.getYear(request.getBirthDay());
        String birthMonth = CommonUtil.getMonth(request.getBirthDay());
        String birthDate = CommonUtil.getDay(request.getBirthDay());

        QueryBuilder wherePredicate = QueryBuilder.newQueryBuilder();
        wherePredicate.eqIfProvided(qmUserRequest.citizenshipCd, request.getCitizenshipCd());
        wherePredicate.goeIfProvided(qmUserRequest.accountOpenD, iFromDateTime);
        wherePredicate.loeIfProvided(qmUserRequest.accountOpenD, iToDateTime);
        wherePredicate.eqIfProvided(qmUserRequest.clientNo, request.getClientNo());
        wherePredicate.eqIfProvided(qmUserRequest.nameMei, request.getNameMei());
        wherePredicate.eqIfProvided(qmUserRequest.nameSei, request.getNameSei());
        wherePredicate.eqIfProvided(qmUserRequest.kanaNameMei, request.getKanaNameMei());
        wherePredicate.eqIfProvided(qmUserRequest.kanaNameSei, request.getKanaNamSei());
        wherePredicate.eqIfProvided(qmUserRequest.birthYear, birthYear);
        wherePredicate.eqIfProvided(qmUserRequest.birthMonth, birthMonth);
        wherePredicate.eqIfProvided(qmUserRequest.birthDate, birthDate);
        wherePredicate.eqIfProvided(qmUserRequestEmail.entryEmail, request.getEntryEmail());
        wherePredicate.eqIfProvided(qmUserRequest.addressPrefectures, request.getAddressPrefectures());
        wherePredicate.eqIfProvided(qmUserRequest.addressMunicipalities, request.getAddressMuinicipalities());

        if (qmUserRequestEmail.openingFlg.equals("0")) {
            wherePredicate.and(qmUserRequestEmail.openingFlg.eq("0"));
        } else {
            wherePredicate.goeIfProvided(qmUserRequestEmail.entryUrlExpiry, LocalDateTime.now());
        }

        return wherePredicate;
    }
}



