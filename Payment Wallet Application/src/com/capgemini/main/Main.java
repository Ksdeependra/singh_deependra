package com.capgemini.main;

import java.math.BigDecimal;
import java.sql.SQLException;

import com.capgemini.exception.AmountNotNullException;
import com.capgemini.exception.InsufficientWalletException;
import com.capgemini.exception.InvalidMobileNoException;
import com.capgemini.exception.MobileNoNotNullException;
import com.capgemini.exception.NameNotNullException;
import com.capgemini.repo.WalletRepo;
import com.capgemini.repo.WalletRepoImpl;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImpl;

public class Main {

	public static void main(String[] args) throws NameNotNullException, ClassNotFoundException, SQLException {
		WalletRepo walletrepo=new WalletRepoImpl();
		WalletService walletservice=new WalletServiceImpl(walletrepo);
		try
		{
			System.out.println(walletservice.createAccount("Akshay", "7500725941",BigDecimal.valueOf(1000)));
			System.out.println(walletservice.createAccount("Ajay", "7569725941",BigDecimal.valueOf(2000)));
			System.out.println(walletservice.depositAmount("7500725941",BigDecimal.valueOf(200)));
			System.out.println(walletservice.withdrawAmount("7500725941", BigDecimal.valueOf(500)));
			System.out.println(walletservice.fundTransfer("7500725941", "7569725941", BigDecimal.valueOf(500)));
	        System.out.println(walletservice.showBalance("7500725941"));
		}
		catch(NameNotNullException e)
		{
			System.out.println("NameNotNullException");
		}
		
		
	
	}

}
