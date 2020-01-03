package com.listner.kafka.model;

public class MessageInfo {

	private String partnerName;
	private String reqMessage;

	public MessageInfo(String partnerName, String reqMessage) {
		super();
		this.partnerName = partnerName;
		this.reqMessage = reqMessage;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getReqMessage() {
		return reqMessage;
	}

	public void setReqMessage(String reqMessage) {
		this.reqMessage = reqMessage;
	}

}
