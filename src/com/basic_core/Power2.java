package com.basic_core;

public class Power2 {
		public void findPower(String argument) {
		
		int num=Integer.parseInt(argument);
		int arr[]=new int[num];
		int i,j;
		for(i=0;i<=num;i++) {
			arr[i]=(int)Math.pow(2, i);
		}
		System.out.println("table of the following");
		for(i=0;i<num;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
		for(i=0;i<num;i++)
		{
			for(j=1;j<=10;j++) {
				System.out.print(arr[i]*j +"\t");
			}
			System.out.println();
		}
	}
		
		
		
	
}



