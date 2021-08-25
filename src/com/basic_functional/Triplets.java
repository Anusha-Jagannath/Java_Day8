package com.basic_functional;

import java.util.Scanner;

public class Triplets {
	public void findTriplets() {
		int num,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements");
		num=s.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter elements of an array");
		for(i=0;i<num;i++) {
			arr[i]=s.nextInt();
		}
		boolean found = false;
	    for (i=0; i<num-2; i++)
	    {
	        for (j=i+1; j<num-1; j++)
	        {
	            for (int k=j+1; k<num; k++)
	            {
	                if (arr[i]+arr[j]+arr[k] == 0)
	                {
	                    System.out.print(arr[i]);
	                    System.out.print(" ");
	                    System.out.print(arr[j]);
	                    System.out.print(" ");
	                    System.out.print(arr[k]);
	                    System.out.print("\n");
	                    found = true;
	                }
	            }
	        }
	    }
	 
	    // If no triplet with 0 sum found in array
	    if (found == false)
	        System.out.println(" not exist ");
	 
	}
	 
		
}


