package com.paulinopjc.taxCollect;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double amount;
		double rate;
		double finalAmount;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Amount: ");
		amount = input.nextDouble();
		System.out.print("Enter Rate: ");
		rate = input.nextDouble();
		input.close();
		
		Calculations calc = new Calculations();
		finalAmount = calc.Tax(amount, rate);
		
		System.out.println(String.format("The Final Amount is %.2f.", finalAmount));

	}

}
