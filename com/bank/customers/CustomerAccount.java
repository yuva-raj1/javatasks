package com.bank.customers;
import com.bank.validation.*;
public class CustomerAccount {
	private int customerId;
	private String customerName;
	private String email;
	private long phoneno;
	private String address;
	private String accountType;
	private double balance;
	private boolean keystatus;
	public CustomerAccount(){
		System.out.println("Customer Profile Initialized — Status: Pending KYC");
	}
	public CustomerAccount(String customerName,long phoneno){
		this();
		setCustomerName(customerName);
		setPhoneno(phoneno);	
	}
	public CustomerAccount(String customerName,long phoneno,String accountType){
		this(customerName,phoneno);
		setAccountType(accountType);		
	}
	public CustomerAccount(int customerId,String customerName,String email,long phoneno,String address,String accountType,double balance,boolean keystatus)
	{
		this(customerName,phoneno,accountType);
		setCustomerId(customerId);
		setEmail(email);
		setAddress(address);
		setBalance(balance);
		setKeystatus(keystatus);
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
		
	}
	public void setCustomerName(String customerName) {
		if(Validation.validName(customerName)) {
			this.customerName=customerName;
		}
	}
	public void setEmail(String email) {
		if(Validation.validEmail(email))
			{
			this.email=email;
			}
	}
	public void setPhoneno(long phoneno) {
		if(Validation.validphone(phoneno))
		{
			this.phoneno=phoneno;
		}
	}
	public void setAddress(String address) {
		if(address.equals(null)||address.equals(" "))
		{
			this.address=address;
		}
	}
	public void setAccountType(String accountType) {
		if(Validation.validaccounttype(accountType)) {
			this.accountType=accountType;
		}
	}
	public void setBalance(double balance) {
		if(balance>=0) {
			this.balance=balance;
		}
	}
	public void setKeystatus(boolean keystatus) {
		this.keystatus = keystatus;
	}
//	functional methods
	public void activateKYC(String dctType) {
		if(dctType.equals(null) && dctType.equals(" ")) {
			keystatus=true;
		System.out.println("Kyc updated succesfully..!");
		}
	}
//	public long getMaskedPhone() {
//			
//	}
	public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }
	public void viewAccountSummary() {
		 System.out.println("\n----- ACCOUNT SUMMARY -----");
	        System.out.println("Customer ID : " + customerId);
	        System.out.println("Name        : " + customerName);
//	        System.out.println("Phone       : " + getMaskedPhone());
	        System.out.println("Account     : " + accountType);
	        System.out.println("KYC Status  : " + (keytatus ? "Completed" : "Pending"));
	        System.out.println("Balance     : " + balance);
	}
}
