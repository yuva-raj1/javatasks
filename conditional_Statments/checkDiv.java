package conditional_Statments;

public class checkDiv {
	public boolean isDivisibleBy5(int num) {
		if(num%5==0 && num%11==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkDiv cd_o=new checkDiv();
		boolean res=cd_o.isDivisibleBy5(50);
		System.out.println("Is 55 divisible by both 5 and 11?: "+res);
	}

}
