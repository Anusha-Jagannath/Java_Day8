package com.basic_functional;

import java.util.Scanner;

public class Quadratic {
	public void findQuadratic() {
		float a,b,c,x1,x2,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the coefficients");
		a=s.nextFloat();
		b=s.nextFloat();
		c=s.nextFloat();
		
		if(a*b*c==0)
		{
			System.out.println("Roots cannot be found");
			System.exit(0);;
		}
		d=(b*b)-(4*a*c);
		x1=(float)(-b+Math.sqrt(d))/(2*a);
		x2=(float)(-b-Math.sqrt(d))/(2*a);
		System.out.println("roots are");
		System.out.println("x1= "+x1+"\n"+"x2="+x2);
		
	}

}
