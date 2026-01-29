package com.tasks;
import java.util.Scanner;
public class checkAutomorphic {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to be checked");
		int value=sc.nextInt();
		int sq_val=value*value,rem;
		while(sq_val!=0)
		{
			rem=sq_val%10;
			if(rem==value)
				System.out.println("Automorphic check success..!");
			System.out.println("Unsucessful check for Automorphic..! ");
		}
		sc.close();
	}

}
