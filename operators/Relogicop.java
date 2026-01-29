package operators;

public class Relogicop {
//	int age,id;
//	int x=6,y=3;
	public void eligible(int a,int id) {
		System.out.println(((a>=18)||(id>0))); 
	}
//	public void analyseBitOp()
//	{
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Relogicop ro=new Relogicop();
		int age=16;
		int id=12;
		ro.eligible(age,id);
		ro.eligible(18, 0);
		ro.eligible(16, 0);
		int x=6,y=3;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(x<<2);
		System.out.println(y>>3);
		
		
	}

}
