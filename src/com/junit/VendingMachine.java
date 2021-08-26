package com.junit;
import java.util.Scanner;

public class VendingMachine {
   public void compute() {
	  	 int i=0;
	  	 int total=0;

	  	 int[] notes = { 1000,500,100,50,10,5,2,1};
	  	 int money;
	  	 int rem;
	  	 System.out.println("Enter the amt");
	  	 Scanner sc=new Scanner(System.in);
	  	 money=sc.nextInt();
	  	 
		if(money>=notes[i])
		{
		// logic for Calculating The notes
			int calNotes =money/notes[i];
			rem = money%notes[i];
			money =rem;
			total += calNotes;
			System.out.println(notes[i]+   " Notes ---> " +calNotes );
			}
		}
	  	 
   }

