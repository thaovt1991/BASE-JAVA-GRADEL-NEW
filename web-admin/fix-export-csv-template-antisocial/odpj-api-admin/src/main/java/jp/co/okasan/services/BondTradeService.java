package jp.co.okasan.services;

import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.request.CheckAvaiableTradingBondParam;
import jp.co.okasan.domain.request.UpdateTradingRequest;

public interface BondTradeService {

    MessageDetail checkCustomerIssueBond(CheckAvaiableTradingBondParam param);

	MessageDetail updateTrading(UpdateTradingRequest request);

}
