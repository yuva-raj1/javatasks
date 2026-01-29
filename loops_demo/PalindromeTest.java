package loops_demo;
//Palindrome or Not?
public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12321,a=num,rev=0;
		System.out.println("Given number:"+num);
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reversed Number:"+rev);
		if(a==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
