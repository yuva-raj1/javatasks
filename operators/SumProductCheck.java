package operators;

public class SumProductCheck {
	public static boolean checkSumVsProduct(int a,int b)
	{
//		System.out.println(((a++ + b++)>(a++ * b++)));
		return ((a++ + b++)>(a++ * b++));
		
	}
//	private int a;
//	private int b;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=12;
//		SumProductCheck spc=new SumProductCheck();
//		spc.x=10;
//		spc.y=12;
		System.out.println(checkSumVsProduct(x,y));
		

	}

}
