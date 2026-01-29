package elcblc_demo;

public class BankAccount {

	long accountNumber;
	String accountHolderName;
	double balance;
	public void setAccountNumber(long acNo) {
		   accountNumber=acNo;
		}
		public void setAccountHolderName(String ac_HName) {
			   accountHolderName=ac_HName;
			}
		public double setbalance(double ac_balance) {
			   balance=ac_balance;
			   return balance;
			}
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	
	public String viewInfo() {
		return "AccountNumber:"+accountNumber+"\nAccountHolderName:"+accountHolderName+"\nAccountbalance:"+balance;
	}
	public double viewBalanceInfo(){
		return balance;
	}
}
