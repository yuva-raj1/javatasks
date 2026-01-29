package operators;

public class StudentMarks {
	int m1,m2,m3;
	public static int total(int a,int b,int c) {
		return a+b+c;
	}
	public void isPassed()
	{
		int t=total(m1,m2,m3);
		t++;
//		System.out.println((t>=120));
		System.out.println((t>=120)?"Passed":"Failed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks smo=new StudentMarks();
		smo.m1=12;
		smo.m2=45;
		smo.m3=64;
		smo.isPassed();

	}

}
