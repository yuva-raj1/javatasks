package com.randompractice;

import java.util.Scanner;

class SalesEmployee{
	private String EmployeeName;
	private String EmployeeId;
	public SalesEmployee(String employeeName, String employeeId) {
		EmployeeName = employeeName;
		EmployeeId = employeeId;
	}	
}
class PerformanceEmployee extends SalesEmployee{
	private double salesEntries;
	private double totalSales;
	private double avgSales;
	private String perfGrade;
	int count=0;
	public PerformanceEmployee(String employeeName, String employeeId, double salesEntries, double totalSales,
			double avgSales, String perfGrade) {
		super(employeeName, employeeId);
		this.salesEntries = salesEntries;
		this.totalSales = totalSales;
		this.avgSales = avgSales;
		this.perfGrade = perfGrade;
		System.out.println("Performance profile creation done..!");
	}
	public void addSales(double se1) {
		if(se1<=0) {System.out.println("Invalid..!Enter sales entries again");
		}
		salesEntries+=se1;
	}
	public void calTotalSales() {
		if(salesEntries<=0) {
			System.out.println("Invalid entries,check again...!");
			perfGrade="Bad";
		}
		totalSales+=salesEntries;
		avgSales=totalSales/count;
		perfGrade="Good";
	}
	public void display()
	{
		System.out.println("\nTotalSales:"+totalSales+
							"\nAverageSales:"+avgSales+
							"\nPerformance Grade:"+perfGrade);
	}
	
}
public class StorePerformanceSystem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String enm=s.next();
		System.out.println("Enter Employee Id:");
		String eid=s.next();
		double se=0;
		double ts=0.0,as=0;
		String pfg="";
		PerformanceEmployee pe_obj=new PerformanceEmployee(enm,eid,se,ts,as,pfg);
		boolean val=true;
		while(val) {
			System.out.println("---Menu---\n1.Add sales\n2.Recalculate Result\n"
					+ "3.View summary\n4.Exit");
			int n=s.nextInt();
			switch(n) {
			case 1:{
				System.out.println("Enter Sales Amount: ");
				double se1=s.nextDouble();
				pe_obj.addSales(se1);
				pe_obj.count++;
				break;
			}
			case 2:
			{
				pe_obj.calTotalSales();
				break;
			}
			case 3:{
				System.out.println("Performance summary:");
				System.out.println("Employee Name:"+enm+"\nEmployee Id:"+eid);
				pe_obj.display();
				break;
			}
			case 4:
			{
				System.out.println("You choose to exit..!Anyway catch you later");
				val=false;
				break;
			}
			default:{
				System.out.println("Invalid choice..!");
				val=false;
				break;
			}
			}
		}
	s.close();	
	}

}
