package com.polymorphism;
class Shape{
	void draw() {
		System.out.println("Drawing shape");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing circle");
	}
}

class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing square");
	}
}

public class Check5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle();
		s.draw();
		 s=new Square();
		s.draw();
	}

}
