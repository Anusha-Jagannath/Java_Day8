package com.logical_problems;

import java.util.Scanner;

public class StopWatch {
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;

	public void findTime() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Press 1 to start timer");
	int n1 = sc.nextInt();
	if(n1==1)
		start();
	System.out.println("Press '2' to Stop Time: ");
	int n2 = sc.nextInt();
	if(n1==2)
		stop();
	elapsed=getElapsedTime();
	System.out.println("Total Time Elapsed(in millisec) is:"+elapsed);
	}
	//to start timer
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}
	
	// to stop timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}
	
	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	
}
	



