package com.bank.validation;

public class Validation {
	
	public static boolean validName(String name)
	{
		if(name.equals(null)||name.equals(" "))
			return false;
		
		return true;		
	}
	public static boolean validphone(long phoneno) {
		int count=0;
		while(phoneno!=0) {
			phoneno%=10;
			count++;
			phoneno/=10;
		}
		if(count!=10)
			return false;
		return true;
	}
	public static boolean validaccounttype(String accountType)
	{
		if(accountType.equals("SAVINGS")||accountType.equals("CURRENT")||
			accountType.equals("SALARY")||accountType.equals("PREMIUM"))
			return true;
		return false;
	} 
	public static boolean validbalance(double balance) {
		if(balance<0)
			return false;
		return true;
	}
	public static boolean validEmail(String email) {
		if(email.equals(null))
			return false;
		return true;
	}
}
