package com.example.parkarbank.util;

import org.springframework.stereotype.Service;

import com.example.parkarbank.entity.AccountDetails;
import com.example.parkarbank.entity.BankUser;
import com.example.parkarbank.exception.InvalidRequestException;

@Service
public class Validation {

	public void registerCustomer(BankUser user){
		
		if(user.getFirstName().equals(""))
		{
			throw new InvalidRequestException("first name should not be null");
		}
        if(user.getLastName().equals(""))
		{
			throw new InvalidRequestException("last name should not be null");
		}
	    if(user.getMiddleName().equals(""))
		{
			throw new InvalidRequestException("middle name should not be null");
		}
	    String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	    if(user.getEmail().matches(emailRegex)== false)
	    {
	    	throw new InvalidRequestException("provide valid emailId");
	    }
	    
	    String mobileRegex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
	    
	    if(user.getMobileNo().matches(mobileRegex)== false)
	    {
	    	throw new InvalidRequestException("provide valid mobile number");
	    }
	    
	    if(user.getAadhaarno().length()!=12)
	    {
	    	throw new InvalidRequestException("provide valid aadhaar number");
	    }
	
	}

	public void addBalanceValidation(AccountDetails accountDetails) {
		
		if(accountDetails.getAccountNumber().equals(""))
		{
			throw new InvalidRequestException("account number cannot be null");
		}
		if(accountDetails.getAccountBalance()<=0)
		{
			throw new InvalidRequestException("please enter amount greater than zero");
		}
		
	}

}
