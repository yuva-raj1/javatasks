package operators;

public class DifferenceCheck {
	public  boolean checkDifference(int x,int y,int z) {
		int result=x-y-z;
		++result;
//		System.out.println(result>0);
		return result>0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20,y=12,z=15;
		DifferenceCheck dco=new DifferenceCheck();
		System.out.println(dco.checkDifference(x,y,z));
		
		
	}	

}
