package com.basic_core;

import java.util.Scanner;

public class HarmonicNumber {
		public void series() {
		int num;
		float res=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the positive number greater than 0");
		num=s.nextInt();
		if(num>0)
		{
			for(float i=1;i<=num;i++)
			{
				System.out.print(1+"/"+(int)i+"\t");
				res+=1/i;
			}
			System.out.println();
			System.out.println("result is "+res);
		}
		else 
			System.out.println("Enter valid number");
	}
}



