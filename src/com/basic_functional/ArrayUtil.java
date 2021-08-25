package com.basic_functional;

import java.util.Scanner;

public class ArrayUtil {
	public void getInt2D() {
		int m,n,i,j;
		System.out.println("Enter m and n");
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		System.out.println("Enter array elements");
		int arr[][]=new int[m][n];
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++)
				arr[i][j]=s.nextInt();
		}
		
		System.out.println("Array elements are");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	
}
