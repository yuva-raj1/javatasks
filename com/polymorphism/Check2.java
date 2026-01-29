package com.polymorphism;
 class Vehicle{
	 void start() {
		 System.out.println("Vehicle started");
	 }
 }
 class Car extends Vehicle{
	 @Override
	 void start()
	 {
		 System.out.println("Car started");
	 }
 }
 
public class Check2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		v.start();
		Car c=new Car();
		c.start();
	}

}
