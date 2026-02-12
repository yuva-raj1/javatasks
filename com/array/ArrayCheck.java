package com.array;

//import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) {
		
		int a[]=new int [3];
		a[0]=10;
		a[1]=20;
		a[2]=30;		
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------");
//		String a1[]=new String[4];
//		Scanner s=new Scanner(System.in);
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(i+" element : ");
//	         a1[i]=s.next();
//		}
//		s.close();
//		System.out.println("---");
//		for(int i=0;i<4;i++) {
//			System.out.println("Elements in array are :l");
//			System.out.println(a1[i]);
//		}

		System.out.println("------");
		
		double d[]=new double[3];
		d[0]=10.5;
		d[1]=20.75;
		d[2]=30.25;
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		System.out.println("----");
		char c[]=new char[5];
//		for(int i=65;i<70;i++) {
//			System.out.println((char)i);// prints A to E without using any array just by ASCII values
//		}
		for(int i=0,j=65;i<c.length;i++,j++)
		{
//			System.out.println(i+" element: "+(char)j);
			c[i]=(char)j;
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		System.out.println("-----");
		
		
//		b1[0]=true;
//		b1[1]=false;
//		for(int i=0;i<2;i++) {
//			System.out.println(b1[i]);
//		}
		boolean b1[]=new boolean[2];
		for(int i=0;i<2;i++) {
			if(i==1) 
				b1[i]=true; //as default value si false b[0] false	
		}
		for(int i=0;i<2;i++) {
			System.out.println(b1[i]);
		}
		System.out.println("----");
		int i1[]= {5,15,25,35,45};
//		for(int i2:i1) {
//			System.out.println(i2);//using for each loop
//		}
		for(int i=0;i<i1.length;i++) {
			System.out.println(i1[i]);
		}
		System.out.println("-----");
		
		String s_arr[]= {"Delhi","Mumbai","Chennai"};
		for(int i=0;i<s_arr.length;i++) {
			System.out.println(s_arr[i]);
		}
		System.out.println("----");
		
		float f[]=new float[] {1.1f,2.2f,3.3f,4.4f};
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);
		}
		System.out.println("-----------");
		
		long lg[]=new long[] {100000L,200000L,300000L};
		for(int i=0;i<lg.length;i++) {
			System.out.println(lg[i]);
		}
		System.out.println("------");
		
		short sharr[]=new short[] {100,200,300,400};
		for(int i=0;i<sharr.length;i++) {
			System.out.println(sharr[i]);
		}
		System.out.println("-----");
		
	}

}
