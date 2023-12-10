package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;

/** The persistent class for the BOND_TRADE database table. */
@Data
@Entity
@Table(name = "BOND_TRADE")
@NamedQuery(name = "BondTrade.findAll", query = "SELECT b FROM BondTrade b")
public class BondTrade implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "TRADE_NO")
  private Integer tradeNo;

  @Column(name = "ACC_HEAD_CD")
  private Integer accHeadCd;

  @Column(name = "ACC_HEAD_NM")
  private String accHeadNm;

  @Column(name = "ACCURED_INTEREST")
  private Integer accuredInterest;

  @Column(name = "ACCURED_INTEREST_FOREIGN")
  private Integer accuredInterestForeign;

  @Column(name = "AV_PRC")
  private Integer avPrc;

  @Column(name = "AV_PRC_FOREIGN")
  private Integer avPrcForeign;

  @Column(name = "BOND_TRADE_CLASS_KBN")
  private Integer bondTradeClassKbn;

  @Column(name = "BOOK_VALUE")
  private Integer bookValue;

  @Column(name = "BOOK_VALUE_FOREIGN")
  private Integer bookValueForeign;

  @Column(name = "BRANCH_CD")
  private Integer branchCd;

  @Column(name = "CANCEL_CORRECT_KBN")
  private Integer cancelCorrectKbn;

  @Column(name = "CAPITAL_GAIN_TAX")
  private Integer capitalGainTax;

  @Column(name = "CAPITAL_GAIN_TAX_FOREIGN")
  private Integer capitalGainTaxForeign;

  @Column(name = "CCY_CD")
  private String ccyCd;

  @Column(name = "COMM_AMT")
  private Integer commAmt;

  @Column(name = "COMMISSION")
  private Integer commission;

  @Column(name = "COMMISSION_FOREIGN")
  private Integer commissionForeign;

  @Column(name = "CONSUMPTION_TAX")
  private Integer consumptionTax;

  @Column(name = "CONSUMPTION_TAX_FOREIGN")
  private Integer consumptionTaxForeign;

  @Column(name = "CUSTOMER_CD")
  private Integer customerCd;

  @Column(name = "DES_TRANSFER_FLG")
  private Integer desTransferFlg;

  @Column(name = "DO_FO_CLASS_KBN")
  private Integer doFoClassKbn;

  @Column(name = "FACE_VALUE")
  private Integer faceValue;

  @Column(name = "FX_COMM_AMT")
  private Integer fxCommAmt;

  @Column(name = "FX_RATE")
  private Integer fxRate;

  @Column(name = "GROSS_AMT")
  private Integer grossAmt;

  @Column(name = "GROSS_AMT_FOREIGN")
  private Integer grossAmtForeign;

  @Column(name = "IN_OUT_CASH_NO")
  private Integer inOutCashNo;

  @Column(name = "INOUT_CASH_KBN")
  private Integer inoutCashKbn;

  @Column(name = "INPUT_BRANCH_CD")
  private Integer inputBranchCd;

  @Column(name = "`INPUT_CLIENT_CD`")
  private Integer inputClientCd;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "LOCAL_TAX")
  private Integer localTax;

  @Column(name = "LOCAL_TAX_FOREIGN")
  private Integer localTaxForeign;

  @Column(name = "LOCAL_WITHHOLD_TAX")
  private Integer localWithholdTax;

  @Column(name = "LOCAL_WITHHOLD_TAX_FOREIGN")
  private Integer localWithholdTaxForeign;

  @Column(name = "MARKET_CD")
  private Integer marketCd;

  @Column(name = "MARKET_NM")
  private String marketNm;

  @Column(name = "`MARUYU_KBN`")
  private Integer maruyuKbn;

  @Column(name = "METHOD_KBN")
  private Integer methodKbn;

  @Column(name = "NATIONAL_TAX")
  private Integer nationalTax;

  @Column(name = "NATIONAL_TAX_FOREIGN")
  private Integer nationalTaxForeign;

  @Column(name = "NET_AMT")
  private Integer netAmt;

  @Column(name = "NET_AMT_FOREIGN")
  private Integer netAmtForeign;

  @Column(name = "ORDER_NO")
  private Integer orderNo;

  @Column(name = "ORDER_SALESMAN_CD")
  private Integer orderSalesmanCd;

  @Column(name = "PRICE")
  private Integer price;

  @Column(name = "PRICE_FOREIGN")
  private Integer priceForeign;

  @Column(name = "REALIZED_PL")
  private Integer realizedPl;

  @Column(name = "REALIZED_PL_FOREIGN")
  private Integer realizedPlForeign;

  @Column(name = "RECEIPT_KBN")
  private Integer receiptKbn;

  @Column(name = "SEC_DEPOSITARY_KBN")
  private Integer secDepositaryKbn;

  @Column(name = "SEC_FULL_DESC")
  private String secFullDesc;

  @Column(name = "SEC_SHORT_DESC")
  private String secShortDesc;

  @Column(name = "SEC_TYPE_KBN")
  private Integer secTypeKbn;

  @Column(name = "SPEC_ACCOUNT_TYPE")
  private Byte specAccountType;

  @Column(name = "SUB_KBN")
  private Integer subKbn;

  @Column(name = "TAX_KBN")
  private Integer taxKbn;

  @Column(name = "TRADE_DT")
  private LocalDateTime tradeDt;

  @Column(name = "TRADE_TYPE_CD")
  private Integer tradeTypeCd;

  @Column(name = "TRADER_CD")
  private Integer traderCd;

  @Column(name = "VALUE_DT")
  private LocalDateTime valueDt;
}
