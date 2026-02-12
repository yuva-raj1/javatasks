package com.task.abstraction;
abstract class GameCharacter{
	String name;
	int level;
	double hPoints;
	GameCharacter(String name,int level,double hPoints){
		this.name=name;
		this.level=level;
		this.hPoints=hPoints;
	}
	abstract void attack();
	void chooseTarget() {
		System.out.println("Target selected.");
	}
	void animateAttack() {
		System.out.println("Attack animation played.");
	}
}
class Warrior extends GameCharacter{
	String wType;
	Warrior(String name, int level, double hPoints,String wType) {
		super(name, level, hPoints);
		this.wType=wType;
		// TODO Auto-generated constructor stub
	}
	@Override
	void attack() {
		System.out.println(" Performing melee attack with "+wType);
	}	
}
class Mage extends GameCharacter{
	String spellType;
	Mage(String name, int level, double hPoints,String spellType) {
		super(name, level, hPoints);
		this.spellType=spellType;
	}
	@Override
	void attack() {
		System.out.println("Casting spell:"+spellType);
	}
}
class Archer extends GameCharacter{
	String arrowType;
	Archer(String name, int level, double hPoints,String arrowType) {
		super(name, level, hPoints);
		this.arrowType=arrowType;
		// TODO Auto-generated constructor stub
	}
	@Override
	void attack() {
		System.out.println("attack() : \"Shooting arrow:"+arrowType+"./" );
		
	}
}
public class GameChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCharacter gc=new Warrior("Conan", 5, 100, "Sword");
		gc.attack();
		gc.chooseTarget();
		gc.animateAttack();
		System.out.println("------");
		gc=new Mage("Gandalf", 7, 120, "Fireball");
		gc.attack();
		gc.chooseTarget();
		gc.animateAttack();
		System.out.println("-----");
		gc=new Archer("Legolas", 8, 110, "Elven Arrow");
		gc.attack();
		gc.chooseTarget();
		gc.animateAttack();
	}

}
