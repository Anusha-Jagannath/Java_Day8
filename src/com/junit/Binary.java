package com.junit;
import java.util.Scanner;
public class Binary {
	public static void toBinary() {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
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
	
	}

}
