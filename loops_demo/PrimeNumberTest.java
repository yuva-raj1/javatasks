package loops_demo;

import java.nio.file.spi.FileSystemProvider;

public class PrimeNumberTest {
//	1st
//	public boolean isPrime(int num)
//	{
//		int count=0;
//		for(int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//				count++;
////			if(count>2) {
////				System.out.println(count);
////				return false;
////			}
//		}
//		return count==2;
//	}
//	2nd
//	public boolean isPrime(int num) {
//		for(int i=2;i<num/2;i++) {
//			if(num%i==0)
//				return false;
//		}
//		System.out.println(i);
//		return true;
//	}
//	3rd
	public boolean isPrime(int num) {
		for(int i=2;i<=(int)Math.sqrt(num);i++)//i=2;i*i<=num;i++
		{
			if(num%i==0) {
				return false;
			}
//			System.out.println(i);
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberTest pt=new PrimeNumberTest();
		for(int i=1;i<=10;i++)
		{
			pt.isPrime(i);
		}
		
//		System.out.println(pt.isPrime(10)?" is a prime no.":" Not a prime no.");

	}

}
