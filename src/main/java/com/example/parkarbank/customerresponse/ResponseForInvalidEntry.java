package com.example.parkarbank.customerresponse;

import java.util.Date;

public class ResponseForInvalidEntry {
	@Override
	public String toString() {
		return "ResponseForInvalidEntry [timestamp=" + timestamp + ", status=" + status + ", message=" + message + "]";
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ResponseForInvalidEntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseForInvalidEntry(Date timestamp, String status, String message) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
	}
	private Date timestamp;
	private String status;
	private String message;
}
