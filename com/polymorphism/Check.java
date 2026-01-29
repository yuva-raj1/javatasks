package com.polymorphism;
class Animal{
	public void makeSound() {
		System.out.println("Animal barks");
	}
	
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Bark");
	}
}
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an=new Animal();
		an.makeSound();
		Dog d=new Dog();
		d.makeSound();
		Animal ani=new Dog();
		Dog dg=(Dog) new Animal();//downcasting no compile time error
		dg.makeSound();//run-time exception
	}

}
