package com.polymorphism;
class Basse{
	static void print() {
		System.out.println("Parent");
	}
}
class Derived extends Basse{
//@Override
	static void print() {//static methods cannot override
		System.out.println("Child");
	}
}
public class Check4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Basse p=new Basse();
		Basse.print();
//		Derived d=new Derived();
		Derived.print();
		
	}

}
