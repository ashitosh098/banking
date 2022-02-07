package com.example.parkarbank.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parkarbank.entity.AccountDetails;
import com.example.parkarbank.entity.MoneyTransfer;
import com.example.parkarbank.repository.AccountDetailsRepository;
import com.example.parkarbank.repository.MoneyTransferRepository;
import com.example.parkarbank.service.AccountService;

@Service
public class AccountServiceImp implements AccountService {
	
	@Autowired
	AccountDetailsRepository  accountDetailsRepository;
	
	@Autowired
	MoneyTransferRepository moneyTransferRepository;
	

	@Override
	public AccountDetails fetchAccountDetails(String accountNumber) {
		
		return accountDetailsRepository.fetchAccountDetails(accountNumber);
		
		
	}


	@Override
	public int updateBalance(String accountNumber, long accountBalance) {
		
		return accountDetailsRepository.updateAccountBalance(accountBalance,accountNumber);
		
	}


	@Override
	public MoneyTransfer updateCreditDebit(MoneyTransfer updateCrDb) {
		// TODO Auto-generated method stub
	return moneyTransferRepository.save(updateCrDb);
		
	}}

	
	

