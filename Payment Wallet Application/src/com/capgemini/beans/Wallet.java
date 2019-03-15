package com.capgemini.beans;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
@Embeddable
public class Wallet {
	private BigDecimal amount;
	
	public Wallet() {
		super();
		this.amount = amount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Wallet [amount=" + amount + "]";
	}


}
