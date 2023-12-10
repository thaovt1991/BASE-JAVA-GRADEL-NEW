package jp.co.okasan.repositories.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.persistence.Query;
import jp.co.okasan.core.utils.DateUtils;
import jp.co.okasan.domain.request.TradeInquiryRequest;
import jp.co.okasan.domain.response.TradeInfoDto;
import jp.co.okasan.enums.SqlOperator;
import jp.co.okasan.repositories.base.BaseRepositoryCustom;
import jp.co.okasan.repositories.base.PageImpl;
import jp.co.okasan.repositories.custom.BondTradeRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@RequiredArgsConstructor
public class BondTradeRepositoryImpl extends BaseRepositoryCustom implements
    BondTradeRepositoryCustom {

  @Override
  public Page<TradeInfoDto> getTradeInquiry(TradeInquiryRequest request) {

    Integer page = request.getPage();
    Integer pageSize = request.getSize();

    Map<String, Object> params = toParamMap(request);
    StringBuilder selectSql = createTradeInquiryQuery(false, params);
    StringBuilder countSql = createTradeInquiryQuery(true, params);
    Query selectQuery = createQuery(selectSql, params);
    selectQuery.setFirstResult((page > 0 ? page - 1 : 0) * pageSize);
    selectQuery.setMaxResults(pageSize);
    Query countQuery = createQuery(countSql, params);
    BigInteger total = (BigInteger) countQuery.getSingleResult();
    var result = (List<TradeInfoDto>) selectQuery.getResultList().stream()
        .map(this::toTradeInfoDto).collect(Collectors.toList());
    return new PageImpl<>(result, PageRequest.of(page > 0 ? page - 1 : 0, pageSize), total.longValue());
  }

  private Map<String, Object> toParamMap(TradeInquiryRequest request) {
    Map<String, Object> params = new HashMap<>();
    params.put("date_from", DateUtils.atStartOfDay(request.getDateFrom()));
    params.put("date_to", DateUtils.atEndOfDay(request.getDateTo()));
    params.put("branch_cd", request.getBranchCd());
    params.put("customer_cd", request.getCustomerCd());
    params.put("issue_cd", request.getIssueCd());
    params.put("trade_type_cd", request.getTradeTypeCd());
    params.values().removeIf(obj -> Objects.isNull(obj));
    return params;
  }

  private Query createQuery(StringBuilder sql, Map<String, Object> params) {
    Query query = em.createNativeQuery(sql.toString());
    for (var entry : params.entrySet()) {
      query.setParameter(StringUtils.toRootUpperCase(entry.getKey()), entry.getValue());
    }
    return query;
  }

  private StringBuilder createTradeInquiryQuery(boolean isCount, Map<String, Object> params) {
    StringBuilder sql = new StringBuilder();
    if (isCount) {
      sql.append("SELECT COUNT(*) FROM");
    } else {
      sql.append("SELECT " + getTradeInquiryColumns() + " FROM");
    }
    sql.append(" ( WITH Q1 AS");
    sql.append(" ( SELECT " + getTradeColumn("BT", getTradeColumns()) + " FROM BOND_TRADE AS BT");
    sql.append(getTradeInquirySqlCondition("BT", params) + " ),");
    sql.append(" Q2 AS");
    sql.append(" ( SELECT " + getTradeColumn("FT", getTradeColumns()) + " FROM FUND_TRADE AS FT");
    sql.append(getTradeInquirySqlCondition("FT", params) + " )");
    sql.append(" SELECT " + getTradeColumn("Q1", getTradeColumns()) + " FROM Q1");
    sql.append(" UNION SELECT " + getTradeColumn("Q2", getTradeColumns()) + " FROM Q2) AS Q3");
    sql.append(leftJoinCodeMaster("Q3", "TRADE_TYPE_CD", "CM1", "CODE_VALUE"));
    sql.append(leftJoinCodeMaster("Q3", "SEC_TYPE_KBN", "CM2", "CODE_VALUE"));
    sql.append(leftJoinCodeMaster("Q3", "SPEC_ACCOUNT_TYPE", "CM3", "CODE_VALUE"));
    // TODO [NBNGOC][ODPJ-330] confirm these does not exist BOND_TRADE
    // sql.append(leftJoinCodeMaster("Q3", "TRADE_REASON_CLASS_KBN", "CM4", "FIELD"));
    // sql.append(leftJoinCodeMaster("Q3", "SETTELMENT_KBN", "CM5", "FIELD"));
    // sql.append(leftJoinCodeMaster("Q3", "TRADE_TYPE_CD", "CM6", "FIELD"));
    return sql;
  }

  private StringBuilder leftJoinCodeMaster(String sourceTableAlias, String sourceColumn,
      String targetTableAlias, String targetColumn) {
    StringBuilder builder = new StringBuilder();
    builder.append(" LEFT JOIN CODE_MASTER " + targetTableAlias);
    builder.append(" ON " + String.format("%s.%s", sourceTableAlias, sourceColumn) + " =");
    builder.append(" " + String.format("%s.%s", targetTableAlias, targetColumn));
    builder.append(" AND " + String.format("%s.FIELD = '%s'", targetTableAlias, sourceColumn));
    return builder;
  }

  private String getTradeInquirySqlCondition(String alias, Map<String, Object> params) {
    StringBuilder builder = new StringBuilder();

    builder.append(" WHERE 1 = 1");
    for (var entry : params.entrySet()) {
      if (Objects.nonNull(entry.getValue())) {
        switch (entry.getKey()) {
          case "date_from":
            builder.append(
                String.format(" AND " + getCondition(alias, SqlOperator.GREAT_THAN_EQUALS),
                    toSnakeUpperCase("TRADE_DT"),
                    toSnakeUpperCase(entry.getKey())));
            break;
          case "date_to":
            builder.append(
                String.format(" AND " + getCondition(alias, SqlOperator.LESS_THAN_EQUALS),
                    toSnakeUpperCase("TRADE_DT"),
                    toSnakeUpperCase(entry.getKey())));
            break;
          default:
            builder.append(
                String.format(" AND " + getCondition(alias, SqlOperator.EQUALS),
                    toSnakeUpperCase(entry.getKey()),
                    toSnakeUpperCase(entry.getKey())));
            break;
        }

      }
    }

    return Objects.isNull(builder) ? StringUtils.EMPTY : builder.toString();
  }

  private String getCondition(String alias, SqlOperator operator) {
    return StringUtils.isBlank(alias) ? "%s " + operator.getOperator() + " :%s"
        : alias + ".%s " + operator.getOperator() + " :%s";
  }

  private String getTradeInquiryColumns() {
    List<String> codeMasterAlias = new ArrayList<>();
    IntStream.range(1, 4).forEach(index -> codeMasterAlias.add("CM" + index));
    String codeMasterColumns = codeMasterAlias.stream()
        .map(alias -> String.format("%s.CODE_NAME AS %s_CODE_NAME", alias, alias))
        .collect(Collectors.joining(", "));
    String tradeColumns = getTradeColumn("Q3", getTradeColumns());
    return tradeColumns + ", " + codeMasterColumns;
  }

  private List<String> getTradeColumns() {
    // TODO [NBNGOC][ODPJ-330] confirm missing column in table so can't union between BOND_TRADE and FUND_TRADE
    return Arrays.asList(
        "TRADE_TYPE_CD",
        "ORDER_NO",
        "BRANCH_CD",
        "CUSTOMER_CD",
        "SEC_TYPE_KBN",
        "ISSUE_CD",
        "SEC_SHORT_DESC",
        // "CLIENT_NM",
        // "TRADE_REASON_CLASS_KBN",
        "SPEC_ACCOUNT_TYPE",
        // "SETTELMENT_KBN",
        "PRICE",
        // "NOMINAL",
        "GROSS_AMT",
        "COMMISSION",
        "CONSUMPTION_TAX",
        "NET_AMT",
        "VALUE_DT",
        "TRADE_NO",
        "TRADE_DT"
    );
  }

  private String getTradeColumn(String alias, List<String> columns) {
    if (CollectionUtils.isEmpty(columns)) {
      return "*";
    }
    String format = StringUtils.isBlank(alias) ? "%s" : alias + ".%s";
    return columns.stream()
        .map(column -> String.format(format, StringUtils.toRootUpperCase(column)))
        .collect(Collectors.joining(", "));
  }

  // TODO [NBNGOC][ODPJ-330] add field 相手方, 取引種類, 約定数量, 約定日時, 備考
  private TradeInfoDto toTradeInfoDto(Object obj) {
    var res = (Object[]) obj;
    return TradeInfoDto.builder()
        .orderNo((toType(res[1], Integer.class)))
        .branchCd(toType(res[2], Integer.class))
        .customerCd(toType(res[3], Integer.class))
        .issueCd(toType(res[5], String.class))
        .secShortDesc(toType(res[6], String.class))
        .price(toType(res[8], BigDecimal.class))
        .grossAmt(toType(res[9], Integer.class))
        .commission(toType(res[10], BigDecimal.class))
        .consumptionTax(toType(res[11], BigDecimal.class))
        .netAmt(toType(res[12], BigDecimal.class))
        .valueDt(toType(res[13], Date.class))
        .tradeNo(toType(res[14], String.class))
        .tradeDt(toType(res[15], Date.class))
        .tradeTypeCd(toType(res[16], String.class))
        .secTypeKbn(toType(res[17], String.class))
        .specAccountType(toType(res[18], String.class))
        .build();
  }

  private <T> T toType(Object value, Class<T> clazz) {
    if (Objects.isNull(value)) {
      return null;
    }
    return (T) value;
  }

  private String toSnakeUpperCase(String str) {
    if (StringUtils.isBlank(str)) {
      return null;
    }
    StringBuilder builder = new StringBuilder(str);
    for (int i = 1; i < builder.length() - 1; i++) {
      if (isUnderscoreRequired(builder.charAt(i - 1), builder.charAt(i), builder.charAt(i + 1))) {
        builder.insert(i++, '_');
      }
    }
    return builder.toString().toUpperCase();
  }

  private boolean isUnderscoreRequired(final char before, final char current, final char after) {
    return Character.isLowerCase(before)
        && Character.isUpperCase(current)
        && Character.isLowerCase(after);
  }
}
