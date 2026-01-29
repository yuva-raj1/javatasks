package com.randompractice;

import java.util.Scanner;

class SubPlan{
	private String subscriberName;
	private String planType;
	public double planCost;
	public double paidAmount;
	public String sub_status;
	public SubPlan(String subscriberName, String planType, double planCost, double paidAmount, String sub_status) {
		this.subscriberName = subscriberName;
		this.planType = planType;
		this.planCost = planCost;
		paidAmount = 0.0;
		sub_status ="" ;
		System.out.println("Creation of subscription recorded");
	}
}

public class SubscriptionPlan {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Subscriber name:");
		String subnm=s.next();
		System.out.println("Enter Plan type:");
		String ptype=s.next();
		System.out.println("Enter plan cost:");
		double pcost=s.nextDouble();
		if(pcost<=0) {System.out.println("Invalid cost of purchase do check it again");
		      System.out.println("Enter again:");
		      pcost=s.nextDouble();
		   }
		double pdamt=0.0;
		String sbst=" ";
		SubPlan sp_obj=new SubPlan(subnm, ptype, pcost, pdamt, sbst);
		boolean val=true;
		while(val) {
			System.out.println("----Menu---\n"+"1.Update Payment\n"
					+ "2.Change status\n3.View Summary\n4.Exit");
			int choice=s.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Update payment:");
				double amt=s.nextDouble();
				if(amt<=0 || amt>sp_obj.planCost) {
					System.out.println("Invalid amount,enter pay again:");
					amt=0;
				}
				sp_obj.paidAmount=amt;
				break;
			}
			case 2:{
				System.out.println("Change status of subscriber:");
				String st1=s.next();
				if(st1.equals("")||st1==null) {
					System.out.println("Invalid choice");
					st1="";
				}
				sp_obj.sub_status=st1;
				break;
				}
			case 3:{
				System.out.println("Subscriber Summary:");
				System.out.println("Subscriber name:"+subnm+"\nPlan Type:"+ptype+
					"\nPlan cost:"+sp_obj.planCost+"\nPaid Amount:"+sp_obj.paidAmount+
					"\nSubscription Status:"+sp_obj.sub_status);
				break;
			}
			case 4:{
				System.out.println("Entered option to exit");
				val=false;
				break;				
			}
			default:{
				System.out.println("Invlaid choice");
				val=false;
				break;
			}
			}
		}
		s.close();
	}

}
