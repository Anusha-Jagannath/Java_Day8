package com.logical_problems;

import java.util.Scanner;

public class Coupon {
		    public static int getCoupon(int n) {
		        return (int) (Math.random() * n);
		    }
		    public static void collect() {
		    	int n;
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter n");
		    	n=sc.nextInt();
		    	
		        boolean[] isCollected = new boolean[n];  
		        int count = 0;                           
		        int distinct  = 0;                      
		        while (distinct < n) {
		            int value = getCoupon(n);            // pick a random card 
		            count++;                             // one more card
		            if (!isCollected[value]) {           // discovered a new card type
		                distinct++;
		                isCollected[value] = true;
		            }
		        }
		        System.out.println("Count is "+count);
		    }


}
