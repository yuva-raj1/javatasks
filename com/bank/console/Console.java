package com.bank.console;
import java.util.Scanner;
import com.bank.customers.*;
public class Console {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 System.out.print("Enter Name: ");
     String name = s.nextLine();

     System.out.print("Enter Phone: ");
     long phone = s.nextLong();

     System.out.print("Enter Account Type: ");
     String type = s.nextLine();
     
     CustomerAccount cat=new CustomerAccount(name,phone,type);
     int choice;
	do{
		System.out.println("Menu:\r\n"
				+ "1. Update Address\r\n"
				+ "2. Update Phone\r\n"
				+ "3. Activate KYC\r\n"
				+ "4. Deposit\r\n"
				+ "5. Withdraw\r\n"
				+ "6. View Summary\r\n"
				+ "7. Exit\r\n"
				+ "");
		System.out.println("Enter your choice: ");
		choice=s.nextInt();
		switch(choice) {
		case 1:
		{
			System.out.println("You choose to update address..!");
			cat.setAddress(s.nextLine());
			break;
		}
		case 2:
		{
			System.out.println("You choose to update phone..!");
			cat.setPhoneno(s.nextLong());
			break;
		}
		case 3:
		{
			System.out.println("You can enter doct type..!");
			cat.activateKYC(s.nextLine());
			break;
		}
		case 4:
		{
			System.out.println("Deposit amount:");
			cat.setBalance(s.nextDouble());
			break;
		}
		case 5:
		{
			System.out.println("Withdraw");
			double a=s.nextDouble();
			if(a>5000 && cat.setKeystatus(false).equals(true))
				System.out.println("KYC not approved");
			else
				cat.withdraw(a);
			break;
		}
		case 6:
		{
//			System.out.println("You choose to update address..!");
			cat.viewAccountSummary();
			break;
		}
		case 7:
		{
			System.out.println("Exit");
			break;
		}
		
			
		}
	}while(choice!=8);
	s.close();
	}

}
