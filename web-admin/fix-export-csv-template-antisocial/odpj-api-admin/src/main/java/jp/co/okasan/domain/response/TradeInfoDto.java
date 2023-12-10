package jp.co.okasan.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.opencsv.bean.CsvBindByPosition;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TradeInfoDto {

  @CsvBindByPosition(position = 0)
  private String tradeTypeCd;

  @CsvBindByPosition(position = 1)
  private Integer orderNo;

  @CsvBindByPosition(position = 2)
  private Integer branchCd;

  @CsvBindByPosition(position = 3)
  private Integer customerCd;

  @CsvBindByPosition(position = 4)
  private String clientNm;

  @CsvBindByPosition(position = 5)
  private String partner;

  @CsvBindByPosition(position = 6)
  private String secTypeKbn;

  @CsvBindByPosition(position = 7)
  private String issueCd;

  @CsvBindByPosition(position = 8)
  private String secShortDesc;

  @CsvBindByPosition(position = 9)
  private String tradeCd;

  @CsvBindByPosition(position = 10)
  private String tradeReasonClassKbn;

  @CsvBindByPosition(position = 11)
  private String specAccountType;

  @CsvBindByPosition(position = 12)
  private String settelmentKbn;

  @CsvBindByPosition(position = 13)
  private BigDecimal price;

  @CsvBindByPosition(position = 14)
  private BigDecimal nominal;

  @CsvBindByPosition(position = 15)
  private Integer grossAmt;

  @CsvBindByPosition(position = 16)
  private BigDecimal commission;

  @CsvBindByPosition(position = 17)
  private BigDecimal consumptionTax;

  @CsvBindByPosition(position = 18)
  private BigDecimal netAmt;

  @CsvBindByPosition(position = 19)
  private Date valueDt;

  @CsvBindByPosition(position = 20)
  private String tradeNo;

  @CsvBindByPosition(position = 21)
  private Date tradeTm;

  @CsvBindByPosition(position = 22)
  private Date tradeDt;

  @CsvBindByPosition(position = 23)
  private String note;

}
