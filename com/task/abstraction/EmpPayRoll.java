package com.task.abstraction;
abstract class Employee{
	abstract void calSalary();
	void applyLeave() {
		System.out.println("Leave applied Successfully");
	}
	void getDetails() {
		System.out.println("Empdetails");
	}
	String empName;
	Integer Id;
	public Employee(String empName, Integer id) {
		this.empName = empName;
		Id = id;
	}
}
class FullTimeEmployee extends Employee{
	Double basePay,benefits;
	public FullTimeEmployee(String empName, Integer id,Double basePay,Double benefits) {
		super(empName, id);
		this.basePay=basePay;
		this.benefits=benefits;		
	}
	@Override
	void calSalary() {
		System.out.println("Calculating salary: Base pay + benefits =\r\n"
				+(basePay+benefits) );
	}
	@Override
	void getDetails() {
		System.out.println("Employee Details:"+empName+","+Id+"\".");
	}	
}
class PartTimeEmployee extends Employee{
	Double hourlyRate ; 
	Integer hoursWorked;
	public PartTimeEmployee(String empName, Integer id, Double hourlyRate, Integer hoursWorked) {
		super(empName, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	@Override
	void calSalary() {
		System.out.println("Calculating salary: Hours worked × rate ="+(hourlyRate*hoursWorked));
	}
	@Override
	void getDetails() {
		System.out.println("Employee Details:"+empName+","+Id+"\".");
	}
}
class Freelancer extends Employee{
	Double projectPayment;

	public Freelancer(String empName, Integer id, Double projectPayment) {
		super(empName, id);
		this.projectPayment = projectPayment;
	}

	@Override
	void calSalary() {
		System.out.println("Calculating salary: Project payment = "+projectPayment );
	}
	@Override
	void getDetails() {
		System.out.println("Employee Details:"+empName+","+Id+"\".");
	}
}
public class EmpPayRoll {

	public static void main(String[] args) {
		
		Employee e;
		e=new FullTimeEmployee("John Doe", 12345, 50000.0, 10000.0);
		e.calSalary();
		e.applyLeave();
		e.getDetails();
		System.out.println("----");
		e=new PartTimeEmployee("Jane Smith", 67890, 20.0, 15);
		e.calSalary();
		e.applyLeave();
		e.getDetails();
		System.out.println("-----");
		e=new Freelancer("Alice Johnson", 54321, 5000.0);
		e.calSalary();
		e.applyLeave();
		e.getDetails();
	}

}
