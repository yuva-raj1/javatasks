package com.problemsolving;

import java.util.Scanner;

public class checkCalculation {
	static double speed;
	static double distance;
	static double time;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean val=true;
		while(val) {
			System.out.println("Find speed, distance and time ");
			System.out.println("Enter 1 to calculate speed: ");
			System.out.println("Enter 2 to calculate distance:  ");
			System.out.println("Enter 3 to calculate time:  ");
			System.out.println("Emter 4 to exit");
			System.out.println("Enter your choice ");
		int n=sc.nextInt();
		switch(n) {
		case 1:
		{
			System.out.println("You are here to calulate speed: ");
			System.out.println("Then enter distance: ");
			double d=sc.nextDouble();
			System.out.println("Enter units of both distance: ");
			String d_u=sc.next();
			System.out.println("Enter time also:");
			double t=sc.nextDouble();
			System.out.println("Enter units of time:");
			String t_u=sc.next();
			switch(d_u) {
			case "km":{
				if(t_u.equals("hr")) {
					speed=d/t;					
				}
				else {
					speed=(d/t)*(60*60);
				}
				break;
			}
			case "m":{
				if(t_u.equals("sec")) {
					speed=(d/t)*(18/5);					
				}
				else {
					speed=(d/t)/(1000);
				}
				break;
			}
			default:{
				System.out.println("Invalid choice");
				break;
				}
			}
			System.out.println("calculated speed :"+speed+" "+"kmph");

			break;
		}
		case 2:
		{
			System.out.println("You are here to calulate distance: ");
			System.out.println("Then enter speed: ");
			double s=sc.nextDouble();
			System.out.println("Enter units of speed");
			String s_units=sc.next();
			System.out.println("Enter time also:");
			double t=sc.nextDouble();
			System.out.println("Enter time units:");
			String t_units=sc.next();
			switch(s_units) {
			case "kmhr":{
				if(t_units.equals("hr")) {
					distance=s*t;
//					String d_units="km";
//					System.out.println("calculated distance :"+distance+" "+(d_units));
				}
				else {
					distance=(s*t)/60;
					
				}
				break;
			}
			case "msec":{
				if(t_units.equals("sec")) {
					distance=(s*t)*(18/5);					
				}
				else {
					distance=(s*t)*1000;
				}
				break;
			}
			default:{
				System.out.println("Invalid choice");
				break;
				}
			}
			System.out.println("calculated distance :"+distance+("km"));
			break;
		}
		case 3:
		{
			System.out.println("You are here to calulate time: ");
			System.out.println("Then enter speed: ");
			double s=sc.nextDouble();
			System.out.println("Enter units of speed");
			String s_units=sc.next();
			System.out.println("Enter distance also:");
			double d=sc.nextDouble();
			System.out.println("Enter distance units:");
			String d_units=sc.next();
//			double t=s/d;
			switch(s_units) {
			case "kmhr":{
				if(d_units.equals("km")) {
					time=d/s;
				}
				else {
					time=(d/s)*1000;				
				}
				break;
			}
			case "msec":{
				if(d_units.equals("m")) {
					time=(d/s)/(60*60);				
				}
				else {
					time=(d/s)*(5/18);
				}
				break;
			}
			default:{
				System.out.println("Invalid choice");
				break;
				}
			}
			System.out.println("calculated time :"+time+" "+"hr");
			break;
		}
		case 4:
		{
			System.out.println("Exit option");
			val=false;
			break;
		}
		default:{
			System.out.println("Invalid choice");
			break;
		}
		}
		
		}
		
		sc.close();
	}

}
