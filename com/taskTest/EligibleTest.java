package com.taskTest;

import java.util.Scanner;

public class EligibleTest {

	public static void main(String[] args) {
		Student student=new Student();
		Scanner s=new Scanner(System.in);
		System.out.println("Check for Eligibility:");
		System.out.println("Enter Student Id:");
		int sid=s.nextInt();
		student.setStudentId(sid);
		System.out.println("Enter Student Name:");
		String sname=s.next();
		student.setStudentName(sname);
		int[] marks=new int[3];
		System.out.println("Enter Marks for 3 Modules");
		for(int i=0;i<marks.length;i++) {
			System.out.println("Module "+(i+1));
			marks[i]=s.nextInt();
			
			try {
			if(marks[i]<0 || marks[i]>100)
				throw new Exception("Marks should be within 0 and 100");
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}	
		}
		student.setMarks(marks);
//		System.out.println("Array of marks "+Arrays.toString(marks));
//		System.out.println();
//		System.out.println(student);
		
		System.out.println(student.displayStudentDetails());
		  student.resultStatus();
	   
		
		s.close();
	}

}
