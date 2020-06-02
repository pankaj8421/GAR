package com.barclys.accounts.info.balance.dao;

import com.barclys.accounts.info.balance.dao.exception.BusinessException;
import com.barclys.accounts.info.balance.dao.exception.SystemException;
import com.barclys.accounts.info.balance.dao.model.BalanceDAORequest;
import com.barclys.accounts.info.balance.dao.model.BalanceDAOResponse;

public interface BalanceDAO {

	BalanceDAOResponse getBalance(BalanceDAORequest balanceDAORequest) throws BusinessException, SystemException;

}
