package com.barclys.accounts.info.balance.dao.exception;

public class BusinessException extends Exception{
public String respCode;
public String respMsg;
public BusinessException(String respCode, String respMsg) {
	super();
	this.respCode = respCode;
	this.respMsg = respMsg;
}
public String getRespCode() {
	return respCode;
}
public String getRespMsg() {
	return respMsg;
}

}
