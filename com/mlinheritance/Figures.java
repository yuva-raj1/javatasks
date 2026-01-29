package com.mlinheritance;
import java.lang.Math;
class Shape{
	Shape(){}
	double calculateArea() {
		return 0;
	}
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double calculateArea() {
		return Math.PI*Math.pow(radius,2);
		}
	double calculateCircleArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
class Rectangle extends Shape{
	double length,width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	double calculateArea() {
		return length*width;
		}
	double calculateRectangleArea() {
		return length*width;
	}
}
class Triangle extends Shape{
	double base,height;
	Triangle(double base,double height){
		this.base=base;
		this.height=height;}
	double calculateArea() {
		return 0.5*base*height;
		}
	double calculateTriangleArea() {
		return 0.5*base*height;
	}
}
public class Figures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(5); 
		System.out.println(circle.calculateArea()); 
		System.out.println(((Circle) circle).calculateCircleArea());
		System.out.println("________________");
		Shape rectangle = new Rectangle(4, 6); 
		System.out.println(rectangle.calculateArea()); 
		System.out.println(((Rectangle) rectangle).calculateRectangleArea());
		System.out.println("________________");
		Shape triangle = new Triangle(3, 7); 
		System.out.println(triangle.calculateArea()); 
		System.out.println(((Triangle) triangle).calculateTriangleArea()); 
		
	}

}
