package com.basic_core;
import java.util.Scanner;

public class PrimeFactors {
		public void primeFactor() {
		int num,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		temp=num;
		if(num>0)
		{
			for (int i=2;i<Math.sqrt(num);i++)
			{
				while(temp%i==0) {
					System.out.println(i+" ");
					temp=temp/i;
				}
			}
		}
		else
			System.out.println("Enter valid number");


	}
		
}
