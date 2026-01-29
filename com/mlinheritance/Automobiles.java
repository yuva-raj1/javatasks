package com.mlinheritance;

 class Vehicle {
String make,model;
int year;
public Vehicle(String make,String model,int year)
{
	this.make=make;
	this.model=model;
	this.year=year;
	}
public void displayInfo() {
	System.out.println(make+" "+model+" "+year);
}
}
class Car extends Vehicle{
	int no_of_doors;
	public Car(String make,String model,int year,int no_of_doors) {
		super(make,model,year);
		this.no_of_doors=no_of_doors;
	}
	public void displayCarInfo() {
//		super.displayInfo();
		System.out.println("Numbeer of doors:"+no_of_doors);
	}
}
class Truck extends Vehicle{
	int cargocapacity;
	public Truck(String make,String model,int year,int cargocapacity) {
		super(make,model,year);
		this.cargocapacity=cargocapacity;
	}
	public void displayTruckInfo() {
//		super.displayInfo();
		System.out.println("Cargocapacity:"+cargocapacity);
	}
}
class Motorcycle extends Vehicle{
	boolean hasSidecar;
	public Motorcycle(String make,String model,int year,boolean hasSidecar) {
		super(make,model,year);
		this.hasSidecar=hasSidecar;
	}
	public void displayMotorcycleInfo() {
//		super.displayInfo();
		System.out.println("HasSidecar:"+hasSidecar);
	}
}
public class Automobiles
{
  public static void main(String[] args) {
	  Vehicle car = new Car("Toyota", "Corolla", 2022, 4); 
	  car.displayInfo();
	  ((Car) car).displayCarInfo(); 
	  System.out.println("-----------");
	  Vehicle truck = new Truck("Ford", "F-150", 2021, 1000); 
	  truck.displayInfo(); 
	  ((Truck) truck).displayTruckInfo(); 
	  System.out.println("-----------");
	  Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true); 
	  motorcycle.displayInfo(); 
	  ((Motorcycle) motorcycle).displayMotorcycleInfo(); 
	  
}}
