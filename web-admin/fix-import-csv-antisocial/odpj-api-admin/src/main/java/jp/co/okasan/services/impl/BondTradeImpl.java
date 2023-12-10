package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.CheckAvaiableTradingBondParam;
import jp.co.okasan.domain.request.UpdateTradingRequest;
import jp.co.okasan.repositories.BondTradeRepository;
import jp.co.okasan.repositories.ClientRepository;
import jp.co.okasan.services.BondTradeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.entity.BondTrade;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class BondTradeImpl implements BondTradeService {

    @Autowired
    private BondTradeRepository bondTradeRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private MessageConverter messageConverter;

    @Override
    public MessageDetail checkCustomerIssueBond(CheckAvaiableTradingBondParam param) {
        if (bondTradeRepository.countByCustomerCdAndMarketCd(param.getClientCdOut(), param.getMarketCd()) == 0) {
            return messageConverter.convert(MessagesCodes.VW000404);
        }
        if (checkCustomerEnterBond(param)) {
            return messageConverter.convert(MessagesCodes.UW0002);
        }
        return messageConverter.convert(MessagesCodes.VM000404);

    }

    Boolean checkCustomerEnterBond(CheckAvaiableTradingBondParam param) {
//        if (clientRepository.countByCustomerCd(param.getClientCdIn()) > 0) {
//            return true;
//        }
        return false;
    }

	@Override
	@Transactional
	public MessageDetail updateTrading(UpdateTradingRequest request) {
		Optional<BondTrade> bondTradeOp = bondTradeRepository.findByIssueCdAndClientCd(request.getDscrCd(),
				request.getClientCd1());
		try {
			BondTrade bondTrade = bondTradeOp.get();
			bondTrade.setCustomerCd(request.getClientCd2());
			bondTradeRepository.save(bondTrade);
		} catch (Exception e) {
			log.error(MessagesCodes.D0000502.name(), e);
			throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
					List.of(messageConverter.convert(MessagesCodes.D0000502)), e);
		}
		return messageConverter.convert(MessagesCodes.UW0002);
	}
}
