package com.randompractice;

import java.util.Scanner;

class StockHandler{
	private String HandlerName;
	private long HandlerId;
	public StockHandler(String handlerName, long handlerId) {
		HandlerName = handlerName;
		HandlerId = handlerId;
	}
	public void v_summary(){
		System.out.println("Handler Name:"+HandlerName+"\nHandlerId:"+HandlerId);
	}
	
}
class StockPerformance extends StockHandler{
	private long stockQuantities;
	private long totalStocks;
	private double avgStock;
	private String handlingGrade;
//	StockPerformance sp=new StockPerformance();
	public StockPerformance(String handlerName, long handlerId, long stockQuantities, long totalStocks, double avgStock,
			String handlingGrade) {
		super(handlerName, handlerId);
		this.stockQuantities = stockQuantities;
		this.totalStocks = totalStocks;
		this.avgStock = avgStock;
		this.handlingGrade = handlingGrade;
		System.out.println("Stock performance profile is generated");
	}
	int count=0;
	public void addStockquant(long addst)
	{   if(addst<=0) {
		System.out.println("Invalid one..!");
	}
		stockQuantities+=addst;
	}
	public void calRes() {
		if(stockQuantities<=0) {System.out.println("Invalid one..!");
		handlingGrade="In/efficient";}
		totalStocks+=stockQuantities;		
		avgStock=totalStocks/count;
		handlingGrade="Efficient";
	}
	
	public void viewSummary() {
		System.out.println("Stock Performance Summary");
		v_summary();
		System.out.println("Total Stocks Handled: "+totalStocks+"\n"+
				"Avg Stock per entry: "+avgStock+"\n"
				+"Handling grade: "+handlingGrade);
	}
	
}

public class PerformaceMonitoringSystem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Handler Name");
		String name=s.next();
		System.out.println("Enter Handler Id");
		long hid=s.nextInt();
		long stq=0;
		long tsq=0;
		double asq=0.0;
		String hgrd=" ";
		StockPerformance sp=new StockPerformance(name, hid,stq,tsq,asq,hgrd);
		boolean val=true;
		while(val) {
			System.out.println("---Menu---\n1.Add stock\n2.Recalculate Result\n"
					+ "3.View summary\n4.Exit");
			int n=s.nextInt();
			switch(n) {
			case 1:{
				System.out.println("Enter Stock quantity:");
				long sq1=s.nextLong();
				sp.addStockquant(sq1);
				sp.count++;
				break;
			}
			case 2:{
				sp.calRes();
				break;
			}
			case 3:{
				sp.viewSummary();
				break;
			}
			case 4:{
				System.out.println("You choose to exit");
				val=false;
				break;				
			}
			default:{
				val=false;
				break;
			}
			}
		}
		s.close();
	}
}
