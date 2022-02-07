package com.example.parkarbank.service;

import com.example.parkarbank.entity.AccountDetails;
import com.example.parkarbank.entity.MoneyTransfer;

public interface AccountService {

	AccountDetails fetchAccountDetails(String accountNumber);

	

	int updateBalance(String accountNumber, long accountBalance);

	MoneyTransfer updateCreditDebit(MoneyTransfer updateCrDb);
	
}
