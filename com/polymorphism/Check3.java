package com.polymorphism;
class Person{
	protected void display() {
		System.out.println("I am a person");
	}
}
class Student extends Person{
	@Override
	public void display() {
		System.out.println("I am a student");
	}
}

public class Check3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.display();//calling child obj ref
		Person p1=new Student();
		p1.display();//calling through child obj ref stored in parent class obj
	}

}
