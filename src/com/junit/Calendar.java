package com.junit;

public class Calendar {

	public static void find(String string, String string2, String string3) {
		int day=Integer.parseInt(string);
		int month=Integer.parseInt(string2);
		int year=Integer.parseInt(string3);
		int y = year - (14 - month) / 12;
	    int x = y + y/4 - y/100 + y/400;
	    int m = month + 12 * ((14 - month) / 12) - 2;
	    int d = (day + x + (31*m)/12) % 7;
	    System.out.println("Day "+d);
		
	}

}
