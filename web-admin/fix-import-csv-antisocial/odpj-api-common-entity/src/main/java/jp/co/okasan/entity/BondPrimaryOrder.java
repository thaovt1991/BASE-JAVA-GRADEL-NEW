package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name = "BOND_PRIMARY_ORDER")
@NamedQuery(name = "BondPrimaryOrder.findAll", query = "SELECT b FROM BondPrimaryOrder b")
public class BondPrimaryOrder implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "PRYMARY_ORDER_NO")
  private int prymaryOrderNo;

  @Column(name = "BOND_TRADE_CLASS_KBN")
  private int bondTradeClassKbn;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CCY_CD")
  private String ccyCd;

  @Column(name = "CCY_NM")
  private String ccyNm;

  @Column(name = "CLIENT_NM")
  private String clientNm;

  @Column(name = "COMM_AMT")
  private int commAmt;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "DES_TRANSFER_FLG")
  private int desTransferFlg;

  @Column(name = "DO_FO_CLASS_KBN")
  private int doFoClassKbn;

  @Column(name = "FACE_VALUE")
  private int faceValue;

  @Column(name = "FX_COMM_AMT")
  private int fxCommAmt;

  @Column(name = "FX_RATE")
  private int fxRate;

  @Column(name = "GROSS_AMT")
  private int grossAmt;

  @Column(name = "GROSS_AMT_FOREIGN")
  private int grossAmtForeign;

  @Column(name = "IN_OUT_CASH_NO")
  private int inOutCashNo;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Column(name = "INPUT_CLIENT_CD")
  private int inputClientCd;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "ISSUE_DT")
  private Date issueDt;

  @Column(name = "MARUYU_KBN")
  private int maruyuKbn;

  @Column(name = "METHOD_KBN")
  private int methodKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "MOUSIKOMI_DATETIME")
  private Date mousikomiDatetime;

  @Column(name = "NET_AMT")
  private int netAmt;

  @Column(name = "NET_AMT_FOREIGN")
  private int netAmtForeign;

  @Column(name = "ORDER_NO")
  private int orderNo;

  @Column(name = "ORDER_SALESMAN_CD")
  private int orderSalesmanCd;

  @Column(name = "P_A_CLASS_KBN")
  private int pAClassKbn;

  @Column(name = "PRICE")
  private int price;

  @Column(name = "PRICE_FOREIGN")
  private int priceForeign;

  @Column(name = "RECEIPT_KBN")
  private int receiptKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "RM_RCV_TM")
  private Date rmRcvTm;

  @Column(name = "SEC_FULL_DESC")
  private String secFullDesc;

  @Column(name = "SEC_SHORT_DESC")
  private String secShortDesc;

  @Column(name = "SEC_TYPE_KBN")
  private int secTypeKbn;

  @Column(name = "SPEC_ACCOUNT_TYPE")
  private byte specAccountType;

  @Column(name = "SUB_KBN")
  private int subKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "SUB_TERM_FROM")
  private Date subTermFrom;

  @Temporal(TemporalType.DATE)
  @Column(name = "SUB_TERM_TO")
  private Date subTermTo;

  @Temporal(TemporalType.DATE)
  @Column(name = "TRADE_DT")
  private Date tradeDt;

  @Column(name = "TRADER_CD")
  private int traderCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "VALUE_DT")
  private Date valueDt;
}
