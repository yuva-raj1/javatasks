package com.wrapper;
public class Wrapper {
	void manualBoxing() {
		int y=10;
		Integer u=Integer.valueOf(y);
		System.out.println("manual boxing"+"\n"+u);		
	}
	void autoBoxing() {
		int y=10;
		Integer u=y;
		System.out.println("auto  boxing"+"\n"+u);		
	}
	void manualUnboxing() {
		Integer y=25;
		int u=Integer.valueOf(y);
		System.out.println("manual unboxing"+"\n"+u);		
	}
	void autoUnBoxing() {
		Integer y=25;
		int u=y;
		System.out.println("auto-unboxing"+"\n"+u);		
	}
	void check() {
//		Integer a=null;
//		int b=a;
//		String str="200";
//		Double d=10.5;
//		double val=d;
//		System.out.println(val);
//		Float f=12.5f;
//		Integer i=f.intValue();
//		System.out.println(i);
//		Character ch='A';
//		System.out.println(Character.isLowerCase(ch));
//		Boolean b1=new Boolean("True");
//		Boolean b2=new Boolean("True");
//		System.out.println(b1==b2);
//		 Boolean b1 = Boolean.valueOf("true"); Boolean b2 = Boolean.TRUE;
//		 System.out.println(b1 == b2); 
//		Short s1 = 100; Short s2 = 100; System.out.println(s1 == s2);
//		String str = "45.6"; Double d = Double.parseDouble(str); System.out.println(d); 
//		Byte b =  128; System.out.println(b); 
//		 Float f = 10.5f; Double d = 10.5; System.out.println(f.equals(d));
//		Character ch = '5'; System.out.println(Character.isDigit(ch)); 
//		Long l = 100; 
//		Boolean b = new Boolean("TrUe"); System.out.println(b); 
//		Integer i = 100; Double d = i * 2.0; System.out.println(d); 
//		Character ch = 'b'; System.out.println(Character.toUpperCase(ch));
//		Float f1 = 10.5f; Float f2 = 10.5f; System.out.println(f1 == f2); 
//		Integer x = null; int y = x; System.out.println(y); 
//		Double d = 20.5; Integer i = d.intValue(); System.out.println(i); 
//		Character c = 'Z'; System.out.println(Character.isUpperCase(c));
//		Integer i = 300; Integer j = 300;
//		 System.out.println(i.equals(j)); 
//		Byte b = new Byte("50"); System.out.println(b);
//		Boolean b1=Boolean.valueOf("False") ;
//		System.out.println(b1);
		
	Short s=32767;
	System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wrapper w=new Wrapper();
		w.autoBoxing();
		w.autoUnBoxing();
		w.manualBoxing();
		w.manualUnboxing();
		w.check();
	}
}
