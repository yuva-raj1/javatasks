package com.college.app;
import com.college.model.*;
import com.college.service.*;
import java.util.Scanner;
public class MainApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainApp mp_obj=new MainApp();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String stn=s.next();
		System.out.println("Enter Student age:");
		int a=s.nextInt();
		System.out.println("Enter contact number:");
		long cn=s.nextLong();
		Person(stn,a,cn);
//		Student(101,"IT","ABC");
		

	}

	private static void Student(int i, String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private static void Person(String string, int i, long cn) {
		// TODO Auto-generated method stub
		
	}

}
