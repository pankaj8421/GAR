package com.barclys.accounts.info.balance.dao.impl;

import org.apache.log4j.Logger;

import com.barclys.accounts.info.balance.dao.BalanceDAO;
import com.barclys.accounts.info.balance.dao.exception.BusinessException;
import com.barclys.accounts.info.balance.dao.exception.SystemException;
import com.barclys.accounts.info.balance.dao.model.BalanceDAORequest;
import com.barclys.accounts.info.balance.dao.model.BalanceDAOResponse;

public class BalanceDAOImpl implements BalanceDAO {
	private static Logger logger = Logger.getLogger(BalanceDAOImpl.class);

	@Override
	public BalanceDAOResponse getBalance(BalanceDAORequest balanceDAORequest)
			throws BusinessException, SystemException {
		System.out.println("enter into dao balance:" + balanceDAORequest);

		// get the request from process layer
		// prepare the req for db
		// call the db get the response
		// prepare the dao response
		BalanceDAOResponse balanceDAOResponse = new BalanceDAOResponse();
		String dbRespCode = "0";
		String dbRespMsg = "success";
		if ("0".equals(dbRespCode)) {
			balanceDAOResponse.setRespCode("0");
			balanceDAOResponse.setRespMsg("sucess");
			balanceDAOResponse.setCashLimit("100000");
			balanceDAOResponse.setOutStandingBalance("70000");
			balanceDAOResponse.setAvailableBalance("30000");
		} else if ("100".equals(dbRespMsg)) {
			throw new BusinessException("111", "Invalid User");

		} else {
			throw new SystemException("222", "Invalid User");

		}

		// System.out.println("Exit from DAO response:" + balanceDAOResponse);
		logger.info("Exit from Dao Response" + balanceDAOResponse);
		return balanceDAOResponse;

	}

}
