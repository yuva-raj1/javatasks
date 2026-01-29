package com.mlinheritance;

class Employee{
	String name;
	double basesal;
	Employee(String name,double basesal){
		this.name=name;
		this.basesal=basesal;
	}
	public double calculateAnnualSalary() {
		return basesal;
	}
}
class Manager extends Employee{
	double bonus;
	int no_of_emp;
	Manager(String name,double basesal,double bonus,int no_of_emp){
		super(name,basesal);
		this.bonus=bonus;
		this.no_of_emp=no_of_emp;
	}
	public double calculateAnnualSalary() {
		return basesal+bonus;
	}
	
	public void calculateManagerSalary() {
//		double sal;
//		sal=super.calculateAnnualSalary()+bonus;
//		System.out.println(sal);
		System.out.println(basesal+bonus);		
	}
}
class Engineer extends Employee{
	int projectcount;
	Engineer(String name,double basesal,int projectcount){
		super(name,basesal);
		this.projectcount=projectcount;
	}
	public double calculateAnnualSalary() {
		return basesal+projectcount*1000;
	}
	public void calculateEngineerSalary() {
		System.out.println(basesal+projectcount*1000);		
	}
}
class Salesperson extends Employee{
	double cm_rate,tsales;
	Salesperson(String name,double basesal,double cm_rate,double tsales)
	{
		super(name,basesal);
		this.cm_rate=cm_rate;
		this.tsales=tsales;
	}
	public double calculateAnnualSalary() {
		return basesal+(cm_rate*tsales);
	}
	public void calculateSalespersonSalary() {
		System.out.println(basesal+(cm_rate*tsales));
	}
}

public class EmployeeSalarycal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee manager = new Manager("Alice", 50000, 10000, 5); 
		System.out.println(manager.calculateAnnualSalary()); 
		((Manager) manager).calculateManagerSalary();
		System.out.println("----------");
		Employee engineer = new Engineer("Bob", 70000, 5); 
		System.out.println(engineer.calculateAnnualSalary());
		((Engineer) engineer).calculateEngineerSalary();
		System.out.println("-------");
		Employee salesperson = new Salesperson("Charlie", 40000, 0.1, 200000); 
		System.out.println(salesperson.calculateAnnualSalary());
		((Salesperson) salesperson).calculateSalespersonSalary();
		
	}

}
