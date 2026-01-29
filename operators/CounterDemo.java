package operators;

public class CounterDemo {
	int count;
	public void updateAndPrint() {
		System.out.println(count++);
		System.out.println(count);
		System.out.println(++count);
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterDemo cdo=new CounterDemo();
		cdo.count=1;
		cdo.updateAndPrint();
	}

}
