package ladder_if_module;

public class InsurancePolicy {
		public String calculatePremium(int age,int exp) {
			if(age>50 && exp>10)
				return "Lowest Premium";
			else if(age<=50 && age>30 && exp>=5 && exp<10)
				return "Moderate Premium";
			else if(age<=30 && age>18 && exp<5)
				return "Highest Premium";			
			return "Not eligible for Insurance";
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsurancePolicy ip=new InsurancePolicy();
		System.out.println(ip.calculatePremium(45,4));
	}

}
