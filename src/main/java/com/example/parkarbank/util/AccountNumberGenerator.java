package com.example.parkarbank.util;

import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class AccountNumberGenerator {
    public long accountNumber() {
    	Random random = new Random();
    	long lg = (long)(100000000000L+random.nextFloat()*900000000000L);
    	return lg;
    	
    }
}