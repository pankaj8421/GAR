package com.barclys.accounts.info.balance.dao.model;

public class BalanceDAORequest {
	private String reqId;
	private String clientId;
	private String channelId;
	private String cardNumber;
	private String cvvNumber;
	private String nameOnCard;
	private String expDate;
	private String typeOfCard;
	private String stDate;
	private String edDate;
	private String balanceType;
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getTypeOfCard() {
		return typeOfCard;
	}
	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}
	public String getStDate() {
		return stDate;
	}
	public void setStDate(String stDate) {
		this.stDate = stDate;
	}
	public String getEdDate() {
		return edDate;
	}
	public void setEdDate(String edDate) {
		this.edDate = edDate;
	}
	public String getBalanceType() {
		return balanceType;
	}
	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BalanceDAORequest [reqId=");
		builder.append(reqId);
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append(", channelId=");
		builder.append(channelId);
		builder.append(", cardNumber=");
		builder.append(cardNumber);
		builder.append(", cvvNumber=");
		builder.append(cvvNumber);
		builder.append(", nameOnCard=");
		builder.append(nameOnCard);
		builder.append(", expDate=");
		builder.append(expDate);
		builder.append(", typeOfCard=");
		builder.append(typeOfCard);
		builder.append(", stDate=");
		builder.append(stDate);
		builder.append(", edDate=");
		builder.append(edDate);
		builder.append(", balanceType=");
		builder.append(balanceType);
		builder.append("]");
		return builder.toString();
	}
	
	
}
