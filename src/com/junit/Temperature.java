package com.junit;

import java.util.Scanner;

public class Temperature {
	public static void temperatureConversion() {
		int choice;
		boolean flag=true;
		float celsius,fahrenhite,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Celsius-Fahrenhite\n2.Fahrenhite -Celsius\n3.exit");
		choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Enter celsius");
			   celsius=sc.nextFloat();
			   result=(celsius*9/5)+32;
			   System.out.println("Fahrenhite value "+result);
			   break;
		case 2:System.out.println("Enter fahrenhite");
			   fahrenhite=sc.nextFloat();
			   result=(fahrenhite-32)*5/9;
			   System.out.println("Celsius value "+result);
			   break;
		case 3:flag=false;
		default:System.out.println("Enter valid choice"); 
			    break;
    }
  }
}
