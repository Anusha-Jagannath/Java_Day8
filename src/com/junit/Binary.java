package com.junit;
import java.util.Scanner;
public class Binary {
	public static void toBinary() {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[100];
		int temp=num;
		int i=0;
		while(temp!=0) {
			arr[i]=num%2;
			temp=temp/2;
			i++;
		}
		
		int temp1, j = arr.length - 4;
		for (i = 0; i < arr.length; i++) { // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		for(i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
	}

	
	

}
