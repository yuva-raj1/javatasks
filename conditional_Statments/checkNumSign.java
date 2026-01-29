package conditional_Statments;

public class checkNumSign {
	public String checkNumber(int num) {
		if(num>0)
			return "Positive";
		if(num<0)
			return "Negative";
		return "Zero";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumSign c_o=new checkNumSign();
		System.out.println("Check -5:"+c_o.checkNumber(-0));
	}

}
