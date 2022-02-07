package com.example.parkarbank.util;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class TransPinGenrator { 
	
	public int transPinGenrator()
	{
		Random random = new Random();
		int transactionPin = 1000 + random.nextInt(9999);
		
		return transactionPin;
		
	}

}
