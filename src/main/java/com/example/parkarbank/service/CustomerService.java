package com.example.parkarbank.service;


import com.example.parkarbank.entity.AccountDetails;
import com.example.parkarbank.entity.BankUser;

public interface  CustomerService {

	 BankUser registerUser(BankUser user);

	 BankUser getCustomerEmail(String email);

	AccountDetails addAccountDetails(AccountDetails accountDetails);



}
