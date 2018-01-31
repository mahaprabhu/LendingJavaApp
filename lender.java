package com.pmdigitronics.rate;


public class lender {
	private String name;
	private double rate;
	private int amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "lender [name=" + name + ", rate=" + rate + ", amount=" + amount + "]";
	}

	

}
