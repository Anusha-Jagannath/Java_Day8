package com.junit;

import java.util.Scanner;

public class Binary2 {
	public static void toBinary() {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int decimal=sc.nextInt();
		int binary[] = new int[40];    
	     int index = 0;  
	     int res=0;
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }  
	     System.out.println("Binary is");
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]+"\t");    
	     } 
	     int swap[]=swapNibbles(binary);
	     System.out.println("after swapping");
	     for(int i=0;i<swap.length;i++)
	     System.out.println(swap[i]+"\t");
	     
	     for(int i=swap.length-1;i>=0;i--)
	    	 res+=(int)swap[i]*Math.pow(swap[i], i);
	     isPower(res);
	     
	     
	    	 
	}
	public static void isPower(int res) {
	while (res!= 1)
    {
        if (res%2 != 0)
            System.out.println("not power of 2");
        res = res/2;
    }
    System.out.println("power of 2");
	}

	static int[] swapNibbles(int[] arr) {
		// swap nibbles at first and last of the array
		// j is used for saving last 4 index of the array
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) { // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

}
