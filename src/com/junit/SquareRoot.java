package com.junit;
import java.util.Scanner;

public class SquareRoot {
	public static void sqrt() {
		System.out.println("Enter the number whose square root to be found");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		double epsilon = 1e-15;    // relative error tolerance
        double t = n;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - n/t) > epsilon*t) {
            t = (n/t + t) / 2.0;
        }
        // print out the estimate of the square root of c
        System.out.println("square root is "+t);
		
		
	}

}
