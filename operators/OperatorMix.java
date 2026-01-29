package operators;

public class OperatorMix {
	int x=5,y=3;
	public void calculate()
	{
		//int res=0;
		System.out.println(x+y+" "+x*y+" "+x/y+" "+x%y+" "+ (x-y));
//		System.out.println(x-y);
		System.out.println(++x+" "+y++);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorMix obj=new OperatorMix();
		obj.calculate();
	}

}
