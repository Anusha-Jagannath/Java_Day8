package com.basic_core;
import java.util.Scanner;

public class Swap {
	public void interchange() {
		Scanner s=new Scanner(System.in);
		int num1,num2,temp;
		System.out.println("Enter num1");
		num1=s.nextInt();
		
		System.out.println("Enter num2");
		num2=s.nextInt();
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swapping");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		
		
	}

}
