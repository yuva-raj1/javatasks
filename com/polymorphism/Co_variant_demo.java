package com.polymorphism;
class Parent{
public void print()
{
//	return a;
	System.out.println("parent");
	}
}
class Child extends Parent{
//	@Override
	public void  print() {
		System.out.println("child");
	}
}
//class Pfac{
//	public Child getObject() {
//		return (Child) new ();
//	}
//}
//
//class Cfac extends Pfac{
//	@Override
//	public Parent getObject() {
//		return new Child();
//	}
//}
public class Co_variant_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		p.print();
		

	}

}
