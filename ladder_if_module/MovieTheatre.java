package ladder_if_module;

public class MovieTheatre {
	public double getTicketPrice(int age) {
		if(age>=60)
			return 0.5*5;
		else if(age<60 && age>=13)
			return  10;
		else if(age<13 && age>=5)
			return 5;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTheatre mv=new MovieTheatre();
		System.out.println(mv.getTicketPrice(14));
	}

}
