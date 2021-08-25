package com.basic_core;
import java.util.Scanner;

public class Largest {
	public void findLarge() {
		Scanner s=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter 3 numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if(num1>num2 && num1>num3) 	
			System.out.println("Largest is "+num1);
		
		if(num2>num1 && num2>num3) 	
			System.out.println("Largest is "+num2);
		
		if(num3>num2 && num3>num1) 	
			System.out.println("Largest is "+num3);
		
	}

}
