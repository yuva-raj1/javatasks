package elcblc_demo;
import java.util.Scanner;

public class ImplementStResult {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=s.next();
		System.out.println("Enter Id");
		int id=s.nextInt();
		System.out.println("Enter Course_Name");
		String cname=s.next();
		System.out.println("Enter Sub_Marks");
		int smarks=s.nextInt();
		
		StudentResult sr=new StudentResult(name,id,cname,smarks);
		boolean ref=true;
		while(ref) {
		System.out.println("Display Menu options:");
		System.out.println("1.Add more subject marks :");
		System.out.println("2.Calculate grade:");
		System.out.println("3.View total marks:");
		System.out.println("4.Exit:");
		int option=s.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Enter the subj marks");
			int marks=s.nextInt();
			sr.addMarks(marks);
			break;
		case 2:
			sr.calGrade();
			break;
		case 3:
			System.out.println(sr.tMarks);
			break;
		case 4:
			System.out.println("Thank you ! Result Processing Completed");
			ref=false;
			break;
			
		default :
				System.out.println("Invalid option");
		}
	
		}
		s.close();	
	}

}
