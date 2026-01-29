package ladder_if_module;

public class BonusCalculator {
//	public double calculateBonus(int exp,int rat,double sal) {
//		if(exp>5 && rat>9)
//			return sal*0.5;
//		else if(exp<=5 && exp>3 && rat<=9 && rat>7)
//			return sal*0.3;
//		else if(exp<=3 && exp>1 && rat<=7 && rat>5)
//			return sal*0.1;
//		else if(exp>5 || rat>9)
//		return sal;
//		else if(exp<=5 && exp>3 || rat>=9 && rat<7)
//			return sal;
//		else if(exp<=3 && exp>1 || rat>=7 && rat<5)
//			return sal;
	public void calculateBonus(int exp,int rat,double sal) {
		if(exp>5 && rat>9)
			System.out.println("Sal hikes 50%:"+0.5*sal);
		else if((exp<=5 && exp>3 && rat<=9 && rat>7))
			System.out.println("Sal hikes 30%"+0.3*sal);
		else if(exp<=3 && exp>1 && rat<=7 && rat>5)
			System.out.println("Sal hikes 10%"+0.1*sal);
		else if(exp>5)
		{
			if(rat<9)
				System.out.println("No Sal hikes due to low rating as needed."+sal);
			else
			    System.out.println("No hike due to low exp");
		}
		else if(exp<=5 && exp>3)
		{
			if(rat>=9 || rat<7)
				System.out.println("No Sal hikes due to low experience needed.:"+sal);
			else
			    System.out.println("No hike due to low rating");
		}
		else if(exp<=3 && exp>1)
		{
			if(rat>=7 || rat<5)
				System.out.println("No Sal hikes due to low experience as needed.:"+sal);
			else
			    System.out.println("No hike due to low rating");
		}
		else
			System.out.println("No hikes");		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonusCalculator bc=new BonusCalculator();
		bc.calculateBonus(6, 10, 10000);
		bc.calculateBonus(5, 9, 10000);
		bc.calculateBonus(3, 6, 10000);
		bc.calculateBonus(7, 8, 10000);
		bc.calculateBonus(6, 9, 10000);
		bc.calculateBonus(5, 10, 10000);
		bc.calculateBonus(4, 7, 10000);
		bc.calculateBonus(3, 8, 10000);
		bc.calculateBonus(2, 5, 10000);
		bc.calculateBonus(1, 7, 10000);	
	}
}
