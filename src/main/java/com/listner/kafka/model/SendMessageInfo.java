package com.listner.kafka.model;

public class SendMessageInfo {

	private String transId;
	private String coreId;
	private String queName;
	private String requestMessage;

	public SendMessageInfo() {
	}

	@Override
	public String toString() {
		return "SendMessageInfo [transId=" + transId + ", coreId=" + coreId + ", queName=" + queName
				+ ", requestMessage=" + requestMessage + "]";
	}

	public SendMessageInfo(String transId, String coreId, String queName, String requestMessage) {
		super();
		this.transId = transId;
		this.coreId = coreId;
		this.queName = queName;
		this.requestMessage = requestMessage;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getCoreId() {
		return coreId;
	}

	public void setCoreId(String coreId) {
		this.coreId = coreId;
	}

	public String getQueName() {
		return queName;
	}

	public void setQueName(String queName) {
		this.queName = queName;
	}

	public String getRequestMessage() {
		return requestMessage;
	}

	public void setRequestMessage(String requestMessage) {
		this.requestMessage = requestMessage;
	}

}
