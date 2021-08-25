package com.basic_functional;

public class WindChill {
	public void findWind(String cmd1,String cmd2) {
		double t=Double.parseDouble(cmd1);
		double v=Double.parseDouble(cmd2);
		double wind=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		System.out.println("Wind chill "+wind);
		
	}

}
