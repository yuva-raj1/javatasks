package com.polymorphism;
class Payment{
	Double amount;
	Integer tlimit;
	Payment(Double pamount,Integer tlimit1){
		amount=pamount;
		tlimit=tlimit1;
	}
	void processPayment(Double pamount1) {
		System.out.println("Payment mode check..!");
	}
}
class Creditcard extends Payment{
	
	Creditcard(Double pamount, Integer tlimit1) {
		super(pamount, tlimit1);
		// TODO Auto-generated constructor stub
	}
	@Override
	void processPayment(Double pamount1) {
		if(pamount1<tlimit) {
			System.out.println("money will be transferred");
		}
		else {
			System.out.println("Might cause issue due to insufficient funds");
		}
		
	}
}
class Debitcard extends Payment{
Debitcard(Double pamount, Integer tlimit1) {
		super(pamount, tlimit1);
		// TODO Auto-generated constructor stub
	}
@Override
void processPayment(Double pamount1) {
		if(pamount1<amount) {
			System.out.println("money will be transferred");
		}
		else {
			System.out.println("Might cause issue due to insufficient funds");
		}
		
	}
}
class UPImode extends Payment{
UPImode(Double pamount, Integer tlimit1) {
		super(pamount, tlimit1);
		// TODO Auto-generated constructor stub
	}
@Override
void processPayment(Double pamount1) {
		if(pamount1<tlimit) {
			System.out.println("money will be transferred");
		}
		else {
			System.out.println("Might cause issue due to insufficient funds");
		}
		
	}	
	}
public class PaymentModes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p;
		p=new Creditcard( 5000.0,12000);
		p.processPayment(3000.0);
		p=new Debitcard(6000.0,50000);
		p.processPayment(12000.0);
		p=new UPImode(20000.0,25000);
		p.processPayment(100000.0);
	}

}
