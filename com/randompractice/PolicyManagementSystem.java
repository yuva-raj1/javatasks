package com.randompractice;

import java.util.Scanner;

class InsurancePolicy{
	String customerName;
	String policyType;
	double policyAmount;
	double approvedAmount;
	String policyStatus;
	public InsurancePolicy(String customerName, String policyType, double policyAmount, double approvedAmount,
			String policyStatus) {
		this.customerName = customerName;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
		this.approvedAmount = approvedAmount;
		this.policyStatus = policyStatus;
	}
	
}

public class PolicyManagementSystem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String c_name=s.next();
		System.out.println("Enter Policy Type:");
		String p_type=s.next();
		System.out.println("Enter Policy Amount:");
		double p_amt=s.nextDouble();
		if(p_amt<=0) {
			System.out.println("Invalid amount, do enter again..!");
			p_amt=s.nextDouble();
		}
		double a_amt=0.0;
		String s_sts="";
		InsurancePolicy ip=new InsurancePolicy(c_name,p_type,p_amt,a_amt,s_sts);
		boolean val=true;
		while(val) {
			System.out.println("--Menu--\n1.Update Approved amount\n2.Change Policy Status"
					+ "\n3.View Summary\n4.Exit ");
			int choice=s.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Update amount:");
				double amt=s.nextDouble();
				if(amt<=0 || amt>p_amt) {
					System.out.println("Invalid amt, do check it once..!");
					amt=0;
				}
				ip.approvedAmount=amt;
				break;			
			}
			case 2:{
				System.out.println("Update Policy Status:");
				String policyStatus=s.next();
				if(policyStatus==null||policyStatus.equals("")) {
					System.out.println("invalid policy status..!");
					policyStatus="";
				}
				ip.policyStatus=policyStatus;
				break;
			}
			case 3:{
				System.out.println("View Summary:");
				System.out.println("Customer"+ip.customerName+
									"\nPolicy Type:"+ip.policyType+
									"\nPolicy Amount:"+ip.policyAmount
									+"\nApproved Amount:"+ip.approvedAmount+
									"\nPolicy Status:"+ip.policyStatus);
				break;
			}
			case 4:
			{
				System.out.println("Choose to exit ...!");
				val=false;
				break;
			}
			default:
			{
				System.out.println("Invalid Choice");
				val=false;
				break;
			}
			}
		}
		
		s.close();
	}

}
