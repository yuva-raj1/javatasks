package ins_stat_op;

public class Car {
	String carMake;
	String carModel;
	int manuf_year;
	public void addcardetails(String c_make,String c_model,int mnf_yr) {
		carMake=c_make;
		carModel=c_model;
		manuf_year=mnf_yr;
	}
	public String displaydetails() {
		return "carmake:"+carMake+"carModel:"+carModel+"manuf_year:"+manuf_year;
	}
	public static void main(String[] args) {
	Car c=new Car();
	c.addcardetails("Mahindra","Scorpio(Calssic & N)",2022);
	System.out.println(c.displaydetails());
	}

}
