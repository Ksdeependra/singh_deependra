package com.capgemini.repo;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import com.capgemini.beans.Customer;

public interface WalletRepo {
       public boolean save(Customer customer);
       public Customer findOne(String mobileNo);
       public void update(String mobileNo,BigDecimal amount);
}
