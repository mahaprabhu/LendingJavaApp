package com.main.lending;

public class Lender implements Comparable<Lender>{
	
	public Lender(String name, double rate, int amount) {
		this.name = name;
		this.rate = rate;
		this.amount = amount;
	}

	private String name;
	private double rate;
	private int amount;
	
	public int compareTo(Lender l) {
		return rate < l.rate ? -1: rate == l.rate ? 0 :1;
	}
	
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
	public String toString() {
		return "Lender [name=" + name + ", rate=" + rate + ", amount=" + amount
				+ "]";
	}
	
}
