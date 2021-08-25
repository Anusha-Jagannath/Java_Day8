package com.logical_problems;

import java.util.Scanner;

public class PerfectNumber {
	public void findPerfect() {
		int num,sum=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		if(sum==num) {
			System.out.println("perfect number");
		}
		else
			System.out.println("not perfect number");
		
	}

}
