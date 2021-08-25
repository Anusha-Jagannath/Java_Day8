package com.basic_functional;

public class Distance {
	public void findDistance(String cmd1,String cmd2) {
		int x=Integer.parseInt(cmd1);
		int y=Integer.parseInt(cmd2);
		double res=Math.sqrt(x*x+y*y);
		System.out.println("dustance between points is "+res);
	}

}
