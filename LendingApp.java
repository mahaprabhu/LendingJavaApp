package com.main.lending;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LendingApp {

	/**
	 * @param args
	 */
	
	private static final String DEFAULT_SEPERATOR = ",";
	
	public static void main(String[] args) {
		
		List<Lender> lenders = new ArrayList<Lender>();
		
		try {
			Scanner reader = new Scanner(new File(args[0]));
			reader.useDelimiter(DEFAULT_SEPERATOR);
			reader.nextLine();
			
			while (reader.hasNext()){
				String[] cols = reader.nextLine().split(DEFAULT_SEPERATOR);

				Lender lend = new Lender(cols[0],Double.parseDouble(cols[1]),Integer.parseInt(cols[2]));
				lenders.add(lend);
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Collections.sort(lenders);
		
		for(Lender lr:lenders ) {
			System.out.println(lr);
		}
		
		CalculateQuote calcquote = new CalculateQuote(lenders);
		LendingQuote quote = calcquote.getQuote(Integer.parseInt(args[1]));
		System.out.println("Requested Amount: £"+quote.getRamt());
		System.out.println("Rate: "+ String.format("%.1f",quote.getRate()*100d)+"%");
		System.out.println("Monthly repayment: £"+ String.format("%.2f",quote.getMonrpt()));
		System.out.println("Total repayment: £"+ String.format("%.2f",quote.getTotrpt()));
	}

}
