package loops_demo;

public class Armstrong_Test {
	
	public int getpower(int base,int exp)
	{
		int p=1;
		for(int i=1;i<=exp;i++)
		{
			p=p*base;
		}
		return p;
	}
	public int getCount(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
			
		}
		return count;
	}
	public boolean getArmstrong(int num)
	{
	int count=getCount(num);
	int temp=num,sum=0;
	while(num!=0)
	{
		int base=num%10;
		sum+=getpower(base, count);
		num/=10;
	}
	return sum==temp;
		
	}
	public static void main(String[] args) {
//		int num=153,temp=num,sum=0;
//		while(num!=0) {
//			sum+=(num%10)^3;
//			num/=10;
//		}
//		if(temp==sum)
//			System.out.println("Armstrong number");
//		else
//			System.out.println("Not a armstrong number");
		Armstrong_Test at = new Armstrong_Test();
		//System.out.println(at.getArmstrong(1634)?"Armstrong number":"Not a Armstrong num");
		for(int y=1;y<=200;y++) {
			if(at.getArmstrong(y))
				System.out.println(y);
//			else
//				System.out.println("Not a Armstronng no.");
	}}
}
