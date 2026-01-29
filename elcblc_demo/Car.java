package elcblc_demo;

public class Car {
int carId;
String brand;
String model;
double rentalPricePerDay;
public void setCarId(int cid) {
	carId=cid;
}
public void setBrand(String c_brand) {
	brand=c_brand;
}
public void setModel(String c_model) {
	model=c_model;
}
public void setRentalPricePerDay(double c_rppd) {
	rentalPricePerDay=c_rppd;	
}
public int getCarId() {
	return carId;
}
public String getBrand() {
	return brand;
}
public String getModel() {
	return model;
}
public double getRentalPricePerDay() {
	return rentalPricePerDay;
}
public String getCarDetails()
{
return "CARID:"+carId+"\nCARBRAND:"+brand+"\nCARMODEL:"+model+"\nCAR_RENTAL_PRICE:"+rentalPricePerDay;
}
}
