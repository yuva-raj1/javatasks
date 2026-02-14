package com.task.one;

import java.util.Scanner;

public class ProjectAssignedEmp extends Employee {
String ProjectName,ProjectRole;
int []a=new int[3];
public String getProjectName() {
	return ProjectName;
}
public void setProjectName(String projectName) {
	ProjectName = projectName;
}
public String getProjectRole() {
	return ProjectRole;
}
public void setProjectRole(String projectRole) {
	ProjectRole = projectRole;
}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	ProjectAssignedEmp pae=new ProjectAssignedEmp();
	System.out.println("Enter Emp name:");
	String nm=s.nextLine();
	pae.setEmployeeName(nm);
	System.out.println("Enter Employee ID:");
	String eid=s.nextLine();
	pae.setEmpId(eid);
	System.out.println("Enter Department");
	String dept=s.nextLine();
	pae.setDepartment(dept);
	System.out.println("Enter Project Name:");
	String pnm=s.nextLine();
	pae.setProjectName(pnm);
	System.out.println("Enter Project Role:");
	String prl=s.nextLine();
	pae.setProjectRole(prl);
	System.out.println("Enter 3 months Performance Scores:");
	for(int i=0;i<pae.a.length;i++) {
		System.out.println("Month "+i+": ");
		pae.a[i]=s.nextInt();
//		System.out.println(s.nextInt());
	}
	System.out.println("Employee profile created!!");
	System.out.println("\n\n");
	
	boolean status=true;
	while(status) {
		System.out.println("----Menu------");
		System.out.println("1. Update Project Role ");
		System.out.println("2. Update Project Name ");
		System.out.println("3. View Employee Profile");
		System.out.println("4. View Average Performance");
		System.out.println("5. Exit ");
		System.out.println("\n\n");
		System.out.println("Enter Choice:");
		int choice=s.nextInt();
		s.nextLine();
		System.out.println("-------");
		switch(choice) {
		case 1:{
			System.out.println("you have choosen to update project role:");
			System.out.println("Do enter new project role:");
			String prl1=s.nextLine();
			if(prl1.equals(null)||prl1.equals("")) {
				System.out.println("Error in project name, do check it out!!");
			}
			else {
			pae.setProjectName(prl1);
			System.out.println("Updated project role");}
		break;	
		}
		case 2:{
			System.out.println("you have choosen to update project name:");
			System.out.println("Do enter new project name:");
			String pnm2=s.nextLine();
			if(pnm2.equals(null)||pnm2.equals("")) {
				System.out.println("Error in project name, do check it out!!");
			}
			else {
			pae.setProjectName(pnm2);
			System.out.println("Updated project role");}
			break;
			}
		case 3:{
			System.out.println("you have choosen to view Employee Profile:");
			System.out.println(pae.getEmpId()+"\n"+pae.getEmployeeName()+"\n"+pae.getDepartment()+"\n"
					+pae.getProjectRole()+"\n"+pae.getProjectName());			
			break;}
		case 4:{
			System.out.println("you have choosen to view avg performance score:");
		    int sum=0; 
			for(int i=0;i<3;i++) {
		    	sum+=pae.a[i]; 
		     }
			int avg=sum/3;
			System.out.println("Average performance score:"+avg);
			break;}
		case 5:{ 
				System.out.println("You have choose to exit");
			      status=false;
					break;}
		default:{
			System.out.println("Entered wrong choice!!");
			break;	
		}
		}
	}
s.close();	
}
}
