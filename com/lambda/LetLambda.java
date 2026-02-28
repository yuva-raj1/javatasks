package com.lambda;
interface GetLambda{
	void display();
//	void show();
}
public class LetLambda {

	public static void main(String[] args) {
		GetLambda getlambda= ()->{  //error due to only one abstract method in GetLambda but not in this case
		System.out.println("Done with obj creation for interface");
		System.out.println("Charan");
		};
		getlambda.display();
//		getlambda.show();

	}

}
