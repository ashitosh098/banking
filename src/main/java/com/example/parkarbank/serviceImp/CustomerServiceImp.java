package com.example.parkarbank.serviceImp;


import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.parkarbank.entity.AccountDetails;
import com.example.parkarbank.entity.BankUser;
import com.example.parkarbank.repository.AccountDetailsRepository;
import com.example.parkarbank.repository.CustomerRepository;
import com.example.parkarbank.service.CustomerService;
import com.example.parkarbank.util.AccountNumberGenerator;
import com.example.parkarbank.util.TransPinGenrator;

@Service
public class CustomerServiceImp implements CustomerService {

@Autowired
PasswordEncoder passwordEncoder;
	
@Autowired
private CustomerRepository customerRepository;

@Autowired
AccountNumberGenerator accountNumberGenerator;

@Autowired
TransPinGenrator transPinGenrator;


	@Override
	public BankUser registerUser(BankUser user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setAccountNo(""+accountNumberGenerator.accountNumber());
		user.setStatus("1");
		user.setCreatedAt(""+new Date());
		user.setUpdatedAt(""+new Date());
		user.setTransPin(""+transPinGenrator.transPinGenrator());
		return customerRepository.save(user);
		
	}


	@Override
	public BankUser getCustomerEmail(String email) {
		
		
		return customerRepository.getCustomerEmail(email);
	}
	
	@Autowired
	AccountDetailsRepository accountDetailsRepository;


	@Override
	public AccountDetails addAccountDetails(AccountDetails accountDetails) {
		
	return 	accountDetailsRepository.save(accountDetails);
	}
}
