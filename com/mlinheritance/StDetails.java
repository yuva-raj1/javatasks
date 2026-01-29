package com.mlinheritance;

class Student{
	String name,stdId;
	Student(String name,String stdId)
	{
		this.name=name;
		this.stdId=stdId;
	}
	void displayStudentInfo() {
		System.out.println("Name "+name+",  Student Id: "+stdId);
	}
}
class Undergraduate extends Student{
	String major;
	Undergraduate(String name,String stdId,String major){
		super(name,stdId);
		this.major=major;
	}
	void displayUndergraduateInfo() {
		System.out.println("Major: "+major);
	}
}
class Graduate extends Student{
	String thesisTopic;
	 Graduate(String name,String stdId,String thesisTopic){
		super(name,stdId);
		this.thesisTopic=thesisTopic;
	}
	void displayGraduateInfo() {
		System.out.println("thesisTopic :"+thesisTopic);
	}
}
class PhDStudent extends Student{
	String researchArea;
	PhDStudent(String name,String stdId,String researchArea){
		super(name,stdId);
		this.researchArea=researchArea;
	}
	void displayPhDStudentInfo() {
		System.out.println("researchArea: "+researchArea);
	}
}
public class StDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student undergraduate = new Undergraduate("Alice", "U12345", "Computer Science"); 
		undergraduate.displayStudentInfo();
		((Undergraduate) undergraduate).displayUndergraduateInfo();
		Student graduate = new Graduate("Bob", "G67890", "Machine Learning"); 
		graduate.displayStudentInfo(); 
		((Graduate) graduate).displayGraduateInfo(); 
		Student phdStudent = new PhDStudent("Charlie", "P11223", "Artificial Intelligence"); 
		phdStudent.displayStudentInfo(); 
		((PhDStudent) phdStudent).displayPhDStudentInfo(); 
	}

}
