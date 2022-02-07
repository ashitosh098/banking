package com.example.parkarbank.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parkarbank.customerresponse.ResponseForInvalidEntry;
import com.example.parkarbank.entity.AccountDetails;
import com.example.parkarbank.service.AccountService;
import com.example.parkarbank.util.Validation;
@RestController
@RequestMapping("/home/transaction")
public class TransactionController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired 
	Validation validation;
	
	
	@PostMapping("/addbalance")
	 public ResponseEntity<Object> addBalance(@RequestBody AccountDetails accountDetails)
	 {
		
		AccountDetails fetchDetails = accountService.fetchAccountDetails(accountDetails.getAccountNumber());
		System.out.println(fetchDetails);
		if(fetchDetails!=null)
		{
			long accountBalance = fetchDetails.getAccountBalance()+accountDetails.getAccountBalance();
			accountService.updateBalance(accountDetails.getAccountNumber(),accountBalance);
			ResponseForInvalidEntry responseStructure = new ResponseForInvalidEntry(new Date(),"200","Account Updated Sucessfully");
			  return new ResponseEntity<Object>(responseStructure,HttpStatus.OK);
		}
		else
		{
			ResponseForInvalidEntry responseStructure = new ResponseForInvalidEntry(new Date(),"409","Invalid Account Number");
			  return new ResponseEntity<Object>(responseStructure,HttpStatus.OK);
		}
		
	 }
	

}
