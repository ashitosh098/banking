package com.example.parkarbank.customerresponse;

import java.util.*;

import com.example.parkarbank.entity.BankUser;
public class CustomerResponse {
		private Date timeStamp;
		@Override
		public String toString() {
			return "CustomerResponse [timeStamp=" + timeStamp + ", status=" + status + ", message=" + message
					+ ", bankUser=" + bankUser + "]";
		}
		public Date getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(Date timeStamp) {
			this.timeStamp = timeStamp;
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
		public BankUser getBankUser() {
			return bankUser;
		}
		public void setBankUser(BankUser bankUser) {
			this.bankUser = bankUser;
		}
		public CustomerResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CustomerResponse(Date timeStamp, String status, String message, BankUser bankUser) {
			super();
			this.timeStamp = timeStamp;
			this.status = status;
			this.message = message;
			this.bankUser = bankUser;
		}
		private String status;
		private String message;
		private BankUser bankUser;
		
}
