package com.main.lending;


import java.util.List;

public class CalculateQuote  {


	
	public CalculateQuote(List<Lender> lenders) {

		this.lenders = lenders;
	}

	private List<Lender> lenders;

	
	
	public List<Lender> getLenders() {
		return lenders;
	}

	public void setLenders(List<Lender> lenders) {
		this.lenders = lenders;
	}

	public int getTotal() {
		int total=0;
		for (Lender lr:lenders) {
			total += lr.getAmount();
		}
	return total;	
	}
	
	
	public LendingQuote getQuote(int reqAmt) {
		
		double rate = 0;
		int ask=0,count=0;
		LendingQuote lq = new LendingQuote(reqAmt,0,0,0);
		
		for (Lender lr:lenders) {
			ask += lr.getAmount();
			rate += lr.getRate();
			count += 1;
			if(ask >= reqAmt) break;
		}
		
		rate = rate/count;
		lq.setRate(rate);
		rate = rate/12;
		double monpmt = reqAmt/((( Math.pow((1+rate), 36))-1)/(rate * Math.pow((1+rate), 36)));
		
		lq.setMonrpt(monpmt);
		lq.setTotrpt(monpmt*36);
		
		return lq;
	}
	

	
}
