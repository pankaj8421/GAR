package com.barclys.accounts.info.balance.dao.model;

public class BalanceDAOResponse {
private String respCode;
private String respMsg;
private String creditLimit;
private String outStandingBalance;
private String availableBalance;
private String cashLimit;
public String getRespCode() {
	return respCode;
}
public void setRespCode(String respCode) {
	this.respCode = respCode;
}
public String getRespMsg() {
	return respMsg;
}
public void setRespMsg(String respMsg) {
	this.respMsg = respMsg;
}
public String getCreditLimit() {
	return creditLimit;
}
public void setCreditLimit(String creditLimit) {
	this.creditLimit = creditLimit;
}
public String getOutStandingBalance() {
	return outStandingBalance;
}
public void setOutStandingBalance(String outStandingBalance) {
	this.outStandingBalance = outStandingBalance;
}
public String getAvailableBalance() {
	return availableBalance;
}
public void setAvailableBalance(String availableBalance) {
	this.availableBalance = availableBalance;
}
public String getCashLimit() {
	return cashLimit;
}
public void setCashLimit(String cashLimit) {
	this.cashLimit = cashLimit;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("BalanceDAOResponse [respCode=");
	builder.append(respCode);
	builder.append(", respMsg=");
	builder.append(respMsg);
	builder.append(", creditLimit=");
	builder.append(creditLimit);
	builder.append(", outStandingBalance=");
	builder.append(outStandingBalance);
	builder.append(", availableBalance=");
	builder.append(availableBalance);
	builder.append(", cashLimit=");
	builder.append(cashLimit);
	builder.append("]");
	return builder.toString();
}

}
