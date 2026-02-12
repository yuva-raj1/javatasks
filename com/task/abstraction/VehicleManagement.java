package com.task.abstraction;

abstract class Vehicle{
	abstract void startEngine();
	String modelName,vehicleNumber,company;
	Vehicle(String modelName,String vehicleNumber,String company){
		this.modelName=modelName;
		this.vehicleNumber=vehicleNumber;
		this.company=company;
	}
	void fuelType() {
		System.out.println("Petrol");
	}
}
class Car extends Vehicle{
	int no_of_Doors;
	boolean has_Sunroof;
	Car(String modelName, String vehicleNumber, String company,int no_of_Doors,boolean has_Sunroof) {
		super(modelName, vehicleNumber, company);
		this.no_of_Doors=no_of_Doors;
		this.has_Sunroof=has_Sunroof;
	}
	@Override
	void startEngine() {
		System.out.println("Starts using key ignition");
	}
	
}
class Bike extends Vehicle{
	boolean hasSidecar;
	Bike(String modelName, String vehicleNumber, String company,boolean hasSidecar) {
		super(modelName, vehicleNumber, company);
		this.hasSidecar=hasSidecar;
	}
	@Override
	void startEngine() {
		System.out.println("Starting engine with kick-start");
	}
}
class Truck extends Vehicle{
	long cargoCapacity;
	Truck(String modelName, String vehicleNumber, String company,long cargoCapacity) {
		super(modelName, vehicleNumber, company);
		this.cargoCapacity=cargoCapacity;
	}
	@Override
	void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up");
	}
	@Override
	void fuelType() {
		System.out.println("Diesel");
	}
}
public class VehicleManagement {

	public static void main(String[] args) {
		Vehicle v=new Car("Toyota Camry", "ABC123", "Toyota", 4, true);
		v.startEngine();
		v.fuelType();
		System.out.println("----------");
		v=new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
		v.fuelType();
		v.startEngine();
		System.out.println("----------");
		v=new Truck("Volvo FH", "DEF456", "Volvo", 20000);
		v.startEngine();
		v.fuelType();
		
		
	}

}
