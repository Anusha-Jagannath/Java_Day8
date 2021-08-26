package com.junit;
import java.util.Scanner;
public class Binary {
	public static void toBinary() {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
<<<<<<< HEAD
		int decimal=sc.nextInt();
		int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]+"\t");    
	     }    	
=======
		int num=sc.nextInt();
		int arr[]=new int[100];
		int temp=num;
		int i=0;
		while(temp!=0) {
			arr[i]=num%2;
			temp=temp/2;
			i++;
		}
		
		int temp1, j = arr.length;
		for (i = 0; i < arr.length; i++) { // loop runs 4 times and swap first four element to last four elements
			temp1 = arr[i];
			arr[i] = arr[j];
			arr[j] = temp1;
			j++;
		}
		for(i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
	}

	
>>>>>>> ecc7c5c950f71d321f5f6208587851d306ea6165
	
	}

}
