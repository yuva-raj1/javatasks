package com.randompractice;

import java.util.Scanner;

class Staff{
	private String staffName;
	private long staffId;
	private String baseShift;
	public Staff(String staffName, long staffId, String baseShift) {
		this.staffName = staffName;
		this.staffId = staffId;
		this.baseShift = baseShift;
	}
	public void v_st_profile() {
		System.out.println("Staff Name:"+staffName+"\n"
							+"StaffId:"+staffId+"\n"+
							"BaseShift:"+baseShift);
	}
}
class DeptStaff extends Staff{
	private String deptName;
	private String resLevel;
	
		
	public DeptStaff(String staffName, long staffId, String baseShift, String deptName, String resLevel)
	{
		super(staffName, staffId, baseShift);
		this.deptName = deptName;
		this.resLevel = resLevel;
		System.out.println("Staff profile has been created");
	}	

	public void ResLevel(String Resp_Level) {
		if(Resp_Level.equals("")||Resp_Level==null) {
			System.out.println("Invalid details");
		}
		else {
			resLevel=Resp_Level;
			System.out.println("Responsibility updated successfully");
		}
	}
	public void Upd_Deptname(String up_depname) {
		if(up_depname.equals("")||up_depname==null) {
			System.out.println("Invalid details");
		}
		else {
			deptName=up_depname;
			System.out.println("Department name updated successfully");
		}
	}
	public void ViewStaffProfile() {
		System.out.println("Details of Staff :");
		v_st_profile();
		System.out.println("Department name:"+deptName+"\n"+
							"Responsibility Level: "+resLevel);
	}
}

public class StaffTrackingApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Staff Name :");
		String sname=sc.next();
		System.out.println("Enter Staff Id: ");
		long sid=sc.nextInt();
		System.out.println("Enter Base shift: ");
		String bs=sc.next();
		System.out.println("Enter Department name: ");
		String dname=sc.next();
		System.out.println("Enter Responsibilty level: ");
		String rl=sc.next();
		DeptStaff ds=new DeptStaff(sname,sid,bs,dname,rl);
		boolean val=true;
		while(val) {
		System.out.println("====Menu=====");
		System.out.println("1.Update Responsibility");
		System.out.println("2.Update Department");
		System.out.println("3.View Profile");
		System.out.println("4.Exit");
		int n=sc.nextInt();
		sc.nextLine();
		switch(n) {
		case 1:
		{	System.out.println("Update Responsibility level");
			String rl1=sc.next();
			ds.ResLevel(rl1);
			break;
		}
		case 2:{
			System.out.println("Update Department name");
			String dptnm=sc.next();
			ds.Upd_Deptname(dptnm);
			break;
		}
		case 3:
		{
			System.out.println("View Profile");
			ds.ViewStaffProfile();
			break;
		}
		case 4:{
			System.out.println("Thank you");
			val=false;
			break;			
		}
		default:{
			System.out.println("Not valid option");
			
			break;
		}
		}
	}
		sc.close();
	}
}

