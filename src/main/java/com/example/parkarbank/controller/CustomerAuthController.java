package com.example.parkarbank.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.parkarbank.customerresponse.CustomResponseForAccountDetails;
import com.example.parkarbank.customerresponse.CustomerResponse;
import com.example.parkarbank.customerresponse.ResponseForInvalidEntry;
import com.example.parkarbank.entity.AccountDetails;
import com.example.parkarbank.entity.BankUser;
import com.example.parkarbank.service.AccountService;
import com.example.parkarbank.service.CustomerService;
import com.example.parkarbank.util.Validation;

@RestController
@CrossOrigin
@RequestMapping("/home/auth")
public class CustomerAuthController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	Validation validation;
	
	@Autowired
	AccountService accountService;
/*	
@GetMapping("/login")
public ModelAndView login()
{
	 ModelAndView mav = new ModelAndView("login");
     mav.addObject("user", new BankUser());
     return mav;
}
*/
	
	
  @PostMapping("/registeruser")
 public ResponseEntity<Object> registerCustomer(@RequestBody BankUser user)
 {
	  validation.registerCustomer(user);
	  BankUser fetchUser = customerService.getCustomerEmail(user.getEmail());
	  if(fetchUser == null)
	  {
		  BankUser registeredCustomer = customerService.registerUser(user);
		  
		  AccountDetails accountDetails = new AccountDetails();
		  
		 accountDetails.setAccountNumber(registeredCustomer.getAccountNo());
		 accountDetails.setBranchName("Pune");
		 accountDetails.setCustomerId(registeredCustomer);
		 accountDetails.setAccountBalance(0);
		 accountDetails.setIfsc("PARKAR202122");
		 accountDetails.setStatus(registeredCustomer.getStatus());
		 
		 accountDetails.setCreatedAt(registeredCustomer.getCreatedAt());
		 accountDetails.setUpdatedAt(registeredCustomer.getUpdatedAt());
		 
		 customerService.addAccountDetails(accountDetails);
		 
			 
			 CustomerResponse responseStructure = new CustomerResponse(new Date(),"Customer Registered Succeesfully","200",registeredCustomer);
			return new ResponseEntity<Object>(responseStructure,HttpStatus.OK);
		  
	  }
	  else
	  {
		  ResponseForInvalidEntry responseStructure = new ResponseForInvalidEntry(new Date(),"409","Customer Already Exsist");
		  return new ResponseEntity<Object>(responseStructure,HttpStatus.OK);
		  
	  }
	  
	  
	
	  
 }


@PostMapping("/login")
  public ResponseEntity<Object> customerLogin(@RequestBody BankUser user)
  {
 	  BankUser fetchUser = customerService.getCustomerEmail(user.getEmail());
 	  if(fetchUser == null)
 	  {
 			
 		 ResponseForInvalidEntry responseStructure = new ResponseForInvalidEntry(new Date(),"409","Invalid user");
		 return new ResponseEntity<Object>(responseStructure,HttpStatus.OK);
 		//return "redirect:/home/auth/login";

 		
 
 	  }
 	  else
 	  {
 		 if(fetchUser.getPassword().equals(user.getPassword()))
 		 {
 			 CustomerResponse responseStructure = new CustomerResponse(new Date(),"loginSucceesfull","200",fetchUser);
 			return new ResponseEntity<Object>(responseStructure,HttpStatus.OK);
 			//return "redirect:/";

 		
 		 }
 		 else
 		 {
 			ResponseForInvalidEntry responseStructure = new ResponseForInvalidEntry(new Date(),"409","Invalid Credentials");
 			  return new ResponseEntity<Object>(responseStructure,HttpStatus.OK); 
 			//return "redirect:/home/auth/login";

 			
 		 }
 	  }
 	  
 	  
 	
 	  
  }




@PostMapping("/fetchAccountDetails")
public ResponseEntity<Object> fetchAccountDetails(@RequestBody AccountDetails accountDetails)
{
	
	 AccountDetails accountDetail=accountService.fetchAccountDetails(accountDetails.getAccountNumber());
	if(accountDetail!=null)
	{
		CustomResponseForAccountDetails responseStructure = new CustomResponseForAccountDetails(new Date(),"AccountDetails fetched successfully","200",accountDetail);
		  return new ResponseEntity<Object>(responseStructure,HttpStatus.OK); 
	}
	else 
	{
		ResponseForInvalidEntry responseStructure = new ResponseForInvalidEntry(new Date(),"409","Invalid AccountDetails");
		  return new ResponseEntity<Object>(responseStructure,HttpStatus.OK);
	}
	
}

  
  
  
  
}
