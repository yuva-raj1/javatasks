package conditional_Statments;

public class checkVote {
	public boolean canVote(int age) {
		if(age>=18)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkVote cv_o=new checkVote();
		System.out.println("Can Vote (Age 20)?"+cv_o.canVote(20));
		if(	cv_o.canVote(12)) {
			System.out.println("Eligible");
		}
	}

}
