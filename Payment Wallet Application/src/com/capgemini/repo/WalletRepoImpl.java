package com.capgemini.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import com.capgemini.ConnectionUtil.ConnectionUtil;
import com.capgemini.beans.Customer;
import com.capgemini.beans.Wallet;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Connection;
public class WalletRepoImpl implements WalletRepo {
	ConnectionUtil cu=new ConnectionUtil();
	
	public boolean save(Customer customer) {
		try {
			EntityManager em=cu.getConnection();
			em.getTransaction().begin();
			//Customer c=new Customer();
			Wallet w=new Wallet();
			customer.setName(customer.getName());
			customer.setMobileNo(customer.getMobileNo());
			w.setAmount(customer.getWallet().getAmount());
			customer.setWallet(w);
			
			em.getTransaction().commit();

		}catch(Exception e) {
			System.out.println(e);
		}
		return true;
	}
	public Customer findOne(String mobileNo)  {
		try {
			Customer c=new Customer();
			EntityManager em=cu.getConnection();
			em.getTransaction().begin();
			c=em.find(Customer.class,mobileNo);
			System.out.println(c);
			em.getTransaction().commit();
			return c;
		}catch(Exception e) {
			System.out.println(e);
		}return null;
	}
public void fundTransfer(String sourceMobileNo,String targetMobileNo,BigDecimal amount,BigDecimal am)	{
		try {	
			EntityManager em=cu.getConnection();
			em.getTransaction().begin();
			Customer c=new Customer();
			Customer c1=new Customer();
			Wallet w=new Wallet();
			Wallet w1=new Wallet();
			System.out.println("xyz");
			c=em.find(Customer.class,sourceMobileNo);
			c1=em.find(Customer.class,targetMobileNo);
			w.setAmount(amount);
			w1.setAmount(am);
			c.setWallet(w);
			c.setWallet(w1);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			System.out.println(e);
		}
  }
public void update(String mobileNo,BigDecimal amount)
{
	try {
		EntityManager em=cu.getConnection();
		em.getTransaction().begin();
		Customer c=new Customer();
		Wallet w=new Wallet();
		System.out.println("pqr");
		c=em.find(Customer.class,mobileNo);
		w.setAmount(amount);
		c.setWallet(w);
	}catch(Exception e) {
		System.out.println(e);
	}
 }
 
}

	


