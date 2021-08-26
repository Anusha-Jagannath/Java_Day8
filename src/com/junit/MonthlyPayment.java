package com.junit;

public class MonthlyPayment {
	public static void monthlyPayment(String s1,String s2,String s3) {
		float principle = Integer.parseInt(s1);
		float year = Float.parseFloat(s2);
		float rate = Float.parseFloat(s3);
		float n = 12*year;
		float r=rate/(12*100);
		float payment =(float) ((principle*r)/(1-Math.pow((1+r),-n)));
		System.out.println("Payement  using compund interest "+payment);
	}
}
