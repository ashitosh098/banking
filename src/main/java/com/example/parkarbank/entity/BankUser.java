package com.example.parkarbank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	@Override
	public String toString() {
		return "BankUser [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", aadhaarno=" + aadhaarno + ", panNo=" + panNo + ", address=" + address
				+ ", dateOfBirth=" + dateOfBirth + ", mobileNo=" + mobileNo + ", email=" + email + ", Password="
				+ Password + ", accountNo=" + accountNo + ", transPin=" + transPin + ", status=" + status
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAadhaarno() {
		return aadhaarno;
	}
	public void setAadhaarno(String aadhaarno) {
		this.aadhaarno = aadhaarno;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getTransPin() {
		return transPin;
	}
	public void setTransPin(String transPin) {
		this.transPin = transPin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public BankUser(long customerId, String firstName, String middleName, String lastName, String aadhaarno,
			String panNo, String address, String dateOfBirth, String mobileNo, String email, String password,
			String accountNo, String transPin, String status, String createdAt, String updatedAt) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.aadhaarno = aadhaarno;
		this.panNo = panNo;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.mobileNo = mobileNo;
		this.email = email;
		Password = password;
		this.accountNo = accountNo;
		this.transPin = transPin;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public BankUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String firstName;
	private String middleName;
	private String lastName;
	private String aadhaarno;
	private String panNo;
	private String address;
	private String dateOfBirth;
	private String mobileNo;
	private String email;
	private String Password;
	private String accountNo;
	private String transPin;
	private String status;
	private String createdAt;
	private String updatedAt;

}
