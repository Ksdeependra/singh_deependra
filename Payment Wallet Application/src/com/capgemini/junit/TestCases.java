package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exception.NameNotNullException;
import com.capgemini.repo.WalletRepo;
import com.capgemini.repo.WalletRepoImpl;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImpl;

class JunitTestCases {
	WalletRepo repo=new WalletRepoImpl();
	WalletService s=new WalletServiceImpl(repo);
	

	@Test
	public void whenvalidinfoispasseddepositsuccessfully() throws NameNotNullException {
		
			s.createAccount("sushil", "9854121412", BigDecimal.valueOf(200));
		


}

	@Test
	public void whenvalidinfoispassedwithdrawsuccessfully() throws NameNotNullException, ClassNotFoundException, SQLException {
		
			s.createAccount("sushil", "9854121412", BigDecimal.valueOf(2000));
			s.withdrawAmount( "9854121412", BigDecimal.valueOf(200));
			
}
}