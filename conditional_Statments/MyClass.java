package conditional_Statments;

public class MyClass {
//	public boolean isEven(int num) {
//		if(num%2==0)
//			return true;
//		return false;
//	}
	public String evenOrOdd(int num) {
		if(num%2==0) 
			return "Even";
		else
			return "Odd";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass o=new MyClass();
//		System.out.println("IS 10 even? "+o.isEven(10));
		System.out.println("IS 10 even? "+o.evenOrOdd(10));
	}
	

}
