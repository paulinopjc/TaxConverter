package com.paulinopjc.taxCollect;

public class Calculations {
	
	public double Tax(double amount, double rate){
		
		double finalAmount = amount * (1 + rate/100);
		return finalAmount;
	}
	
}
