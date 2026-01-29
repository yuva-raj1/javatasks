package cm_ap;

public class SimpleInterestCalculator {
	static double calculateSimpleInterest(double principal,double rate,double time){
		double si=(principal*rate*time)/100;
		return si;				
	}	
	public static void main(String[] args) {
	System.out.println(calculateSimpleInterest(35000.750,2,2.5));	
	}
}
