package com.basic_core;
import java.util.Scanner;

public class EvenOdd {
	public void findEven() {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		if(num%2==0)
			System.out.println("Even no");
		else
			System.out.println("odd no");
		
	}

}
