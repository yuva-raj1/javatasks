-------------------------
1)AddditionCalculator

package cm_ap;

public class Additionalcalculator {
	public static int addTwonumbers(int a,int b){
		int c=a+b;
		return c;
	};
	public static void main(String[] args) {
		int d=addTwonumbers(20,25);
		System.out.println(d);
	}
}
------------------------------
2)MultiplicationCalculator

package cm_ap;

public class MultiplicationCalculator {
	static int multiplytwonumbers(int a,int b) {
		//int c = a*b;
		return a*b;
	}
	
	public static void main(String[] args) {
		multiplytwonumbers(9,11);
		System.out.println(multiplytwonumbers(9,11));
	}

}
-----------------------------------
3)SquareCalculator

package cm_ap;

public class SquareCalculator {
	static int sqofnum (int n) {
		return n*n;		
	}
	public static void main(String[] args) {
	System.out.println(sqofnum (9));
	}
}
------------------------------------
4)Additionalcalc

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
---------------------------------------
5) Simple interest calci

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


