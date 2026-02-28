package com.lambda;
import java.util.function.Consumer;
import java.util.function.Predicate;
//public interface java.util.function.Predicate<Integer>{
//	Boolean test()
//}
public class Check {
	public static boolean isPrime(int num) {
		if(num<=1)
			return false;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {

    Predicate<Integer> pred= num -> isPrime(num);
    System.out.println(pred.test(17)?"P":"!P");
    Consumer<Character> con=  ch  -> System.out.println(isPrime(ch)?"P"+""+ch+""+(int)ch
    															:"!P"+""+ch+""+(int)ch);
    con.accept('B');

	}

}
