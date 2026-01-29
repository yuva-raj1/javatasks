package cm_ap;

public class AverageCalculator {
	static double avgofthreenum(double a,double b,double c) {
		double avg=(a+b+c)/3;
		return avg;
	}
	public static void main(String[] args) {
		System.out.println(avgofthreenum(7.85,7.97,8.02));
	}
}
