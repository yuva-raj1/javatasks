package elcblc_demo;

public class CarRentalService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.setCarId(77);
		c1.setBrand("MERCEDES BENZ");
		c1.setModel("S Class");
		c1.setRentalPricePerDay(32500);
		c1.getCarDetails();
		System.out.println(c1.getCarDetails());
		}
}
