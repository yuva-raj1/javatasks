package com.wrapper;

public class Wrapperwinding {
	public void print(byte b) {
		System.out.println("byte"+b);
	}
//	public void print(int a) {
//		System.out.println("int"+a);
//	}
	public void print(short s) {
		System.out.println("short"+s);
	}
//	public void print(long l) {
//		System.out.println("long"+l);
//	}
//	public void print(double d) {
//		System.out.println("double"+d);
//	}
//	public void print(float f) {
//		System.out.println("float"+f);
//	}
	public void print(Integer I) {
		System.out.println("Integer"+I);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Wrapperwinding().print(14);//wrapper class 
		float f=3.4f;
		byte b1=(byte) f;//downcasting
		System.out.println("byte b:"+b1);
		char c='u';
		int i=c;//upcasting
		System.out.println("int value of u that is i ="+i);
		c='v';
		i=c;
		System.out.println("int value of v that is i ="+i);
//		boolean val=true;
//		String str=(boolean)val;//failed to boolean to string
//		System.out.println("boolean converted into  string");
		int num=35;
		char ch=(char) num;//downcasting
		System.out.println("conversion of int value to char "+ch);
		num=97;
		ch=(char) num;
		System.out.println("conversion of int value to char "+ch
				+"hence we can conclude the ASCII value of "+ch+"is"+num);
		for(int q=97;q<=121;q++) {
			System.out.println("ASCII val of "+(char)q+" is "+q);
		}
//		i=12;
		double d=12.34;
		i=(int) d;//downcasting demo
		System.out.println("int val is "+i);
		
		f=99.99f;
		d=f;		//upcasting demo
		System.out.println("float val is :"+ d);
	
	}

}
