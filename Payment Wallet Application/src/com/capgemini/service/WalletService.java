package com.capgemini.service;

import java.math.BigDecimal;
import java.sql.SQLException;

import com.capgemini.beans.Customer;
import com.capgemini.exception.InvalidMobileNoException;
import com.capgemini.exception.MobileNoNotNullException;
import com.capgemini.exception.NameNotNullException;

public interface WalletService {
	public Customer createAccount(String name,String mobileNo,BigDecimal amount) throws NameNotNullException;
	public Customer showBalance(String mobileNo);
	public Customer fundTransfer(String sourcemobileNo,String targetmobileNo,BigDecimal amount);
	public Customer depositAmount(String mobileNo,BigDecimal amount);
	public Customer withdrawAmount(String mobileNo,BigDecimal amount); 
}
