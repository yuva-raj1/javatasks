package com.task.abstraction;
import java.util.Random;
abstract class Payment{
	abstract void processPayment();
	abstract void validateTransaction();
	void generateTransactionId() {
		System.out.println("Generated transaction Id:");
	}
	Random r = new Random();
	long num = r.nextLong();
}
class CreditCardPayment extends Payment{
	String cardNumber,expiryDate,cvv;

	public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}
	@Override
	void processPayment() {
		System.out.println(" \"Processing credit card payment.\"");
	}
	@Override
	void validateTransaction() {
		System.out.println("\"Validating card number, expiry, and CVV.\"");
	}
	@Override
	void generateTransactionId() {
		System.out.println("Generated transaction Id:"+num);	
	} 
}
class UPIPayment extends Payment{
	String upiId,phoneno;

	public UPIPayment(String upiId, String phoneno) {
		super();
		this.upiId = upiId;
		this.phoneno = phoneno;
	}

	@Override
	void processPayment() {
		System.out.println(" \"Processing UPI payment.\"");	
	}
	@Override
	void validateTransaction() {
		System.out.println("\"Validating UPI ID and phone number.\"");	
	}
	@Override
	void generateTransactionId() {
		System.out.println("Generated transaction Id:"+num);
	}
}
class PayPalPayment extends Payment{
	String 	email ,	authToken;

	public PayPalPayment(String email, String authToken) {
		super();
		this.email = email;
		this.authToken = authToken;
	}

	@Override
	void processPayment() {
	System.out.println(" \"Processing PayPal payment.\"");
	}

	@Override
	void validateTransaction() {
	System.out.println(" \"Validating email and authentication token.\"");
	}
	@Override
	void generateTransactionId() {
		System.out.println("Generated transaction Id:"+num);
	}
}
public class PaymentSystem {

	public static void main(String[] args) {
		Payment p;
		p=new CreditCardPayment("1234567890123456", "12/25", "123");
		p.processPayment();
		p.validateTransaction();
		p.generateTransactionId();
		System.out.println("------");
		p=new  UPIPayment("rajj@upi", "99848012345");
		p.processPayment();
		p.validateTransaction();
		p.generateTransactionId();
		System.out.println("-----");
		p=new PayPalPayment("rajj@gmail.com", "9584736");
		p.processPayment();
		p.validateTransaction();
		p.generateTransactionId();
	}

}
