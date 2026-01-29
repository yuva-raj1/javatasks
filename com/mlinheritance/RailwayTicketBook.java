package com.mlinheritance;
 class Railway{
	 int trainNo;
}
 class Ticket extends Railway{
	 double basefare;
	 int disKm;
	 Ticket(double basefare,int disKm){
		 this.basefare=basefare;
		 this.disKm=disKm;
	 }
	 
 }
 class SleeperTicket extends Ticket{
	 double spcharge;
	 SleeperTicket(double spcharge){
		 super(234.5,450);
		 this.spcharge=spcharge;		 
	 }
	 void display() {
		 int rate=10;
		 double tf=basefare+(disKm*rate)+spcharge;
		 System.out.println(trainNo+" "+"Total fare:"+tf);
	 }
 }



public class RailwayTicketBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleeperTicket st=new SleeperTicket(650);
		st.trainNo=123;
		st.display();
		
	}

}
