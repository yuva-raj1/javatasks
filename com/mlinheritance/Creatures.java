package com.mlinheritance;
class Animal{
	String name,habitat;
	Animal(String name,String habitat){
		this.name=name;
		this.habitat=habitat;
	}
	public void displayHabitat() {
		System.out.println("Habitat:"+habitat);
	}
}
class Mammal extends Animal{
	boolean isWarmBlooded;
	Mammal(String name,String habitat,boolean isWarmBlooded)
	{
		super(name,habitat);
		this.isWarmBlooded=isWarmBlooded;
	}
	public void displayMammalInfo() {
		System.out.println("IS Warm Blooded:"+isWarmBlooded);
	}
}
class Bird extends Animal{
	boolean canFly;
	Bird(String name,String habitat,boolean canFly){
		super(name,habitat);
		this.canFly=canFly;
	}
	public void displayBirdInfo() {
		System.out.println("Can Fly:"+canFly);
	}
}
class Reptile extends Animal{
	boolean isColdBlooded;
	Reptile(String name,String habitat,boolean isColdBlooded){
		super(name,habitat);
		this.isColdBlooded=isColdBlooded;
	}
	public void displayReptileInfo() {
		System.out.println("is Cold Blooded:"+isColdBlooded);
	}
}
public class Creatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal mammal = new Mammal("Lion", "Savannah", true); 
		mammal.displayHabitat(); 
		((Mammal) mammal).displayMammalInfo();
		Animal bird = new Bird("Eagle", "Forest", true); 
		bird.displayHabitat(); 
		((Bird) bird).displayBirdInfo();
		Animal reptile = new Reptile("Snake", "Desert", true); 
		reptile.displayHabitat(); 
		((Reptile) reptile).displayReptileInfo(); 		
	}
}
