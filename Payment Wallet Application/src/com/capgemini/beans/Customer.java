package com.capgemini.beans;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Wallet")
		public class Customer{
	@Id
	//@Column(name="mobile")
	private String mobileNo;
	//@Column(name="name")
	private String name;
	@Embedded
	private Wallet wallet;
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public Wallet getWallet() {
			return wallet;
		}
		public void setWallet(Wallet wallet) {
			this.wallet = wallet;
		}
		@Override
		public String toString() {
			return "Customer [name=" + name + ", mobileNo=" + mobileNo + ", wallet=" + wallet + "]";
		}
		

	}



