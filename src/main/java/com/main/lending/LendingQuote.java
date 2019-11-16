package com.main.lending;

public class LendingQuote {
	
	public LendingQuote(int ramt, double rate, double monrpt, double totrpt) {
		this.ramt = ramt;
		this.rate = rate;
		this.monrpt = monrpt;
		this.totrpt = totrpt;
	}
	private int ramt;
	private double rate;
	private double monrpt;
	private double totrpt;
	
	public int getRamt() {
		return ramt;
	}
	public void setRamt(int ramt) {
		this.ramt = ramt;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getMonrpt() {
		return monrpt;
	}
	public void setMonrpt(double monrpt) {
		this.monrpt = monrpt;
	}
	public double getTotrpt() {
		return totrpt;
	}
	public void setTotrpt(double totrpt) {
		this.totrpt = totrpt;
	}
	public String toString() {
		return "LendingQuote [ramt=" + ramt + ", rate=" + rate + ", monrpt="
				+ monrpt + ", totrpt=" + totrpt + "]";
	}
}
