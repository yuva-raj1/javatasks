package elcblc_demo;

public class BankApplication {

	public static void main(String[] args) {
		BankAccount ba_obj=new BankAccount();
		ba_obj.setAccountNumber(987654321);
		ba_obj.setAccountHolderName("Irfan Khan");
		double b1=ba_obj.setbalance(753);
		System.out.println(ba_obj.viewInfo());
		double b2=b1+ba_obj.setbalance(899);
//		ba_obj.setbalance(ba_obj.getBalance()+899);
//		System.out.println("Updated balance:"+(ba_obj.setbalance(753)+ba_obj.setbalance(899)));
		System.out.println("Updated balance:"+b2);
		double b3=b2-147.25;
		System.out.println(b3);
	}
}
//Scenario 2: Bank Account Management
//Question:
//You need to develop a banking system where customers have bank accounts.
//Create a business logic class called 
//BankAccount with the following instance
//variables:
//accountNumber (long) → Stores the unique bank account number.
//accountHolderName (String) → Stores the name of the account holder.
//balance (double) → Stores the current balance in the account.
//Provide setter and getter methods for all fields.
//Create an executable logic class called 
//BankApplication that:
//1. Creates a 
//BankAccount object.
//2. Uses setters to assign values to the account.
//3. Retrieves and prints account details using getters.
//4. Updates the balance using a setter
