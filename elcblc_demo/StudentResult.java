package elcblc_demo;

public class StudentResult {
	public String stName;
	public int stId;
	public String crsName;
	public double tMarks;
	 StudentResult(String stName,int stId,String crsName,double tMarks)
	{
		this.stName=stName;
		this.stId=stId;
		this.crsName=crsName;
		this.tMarks=tMarks;
		System.out.println("Student Recorded created successfully");
	}

	 
	public void addMarks(double marks) {
		if(marks<=0) {
			System.out.println("Invalid  marks entered");
			}
		tMarks+=marks;
		System.out.println("Marks updated successfully...!");	
	}
	public void calGrade() {
		if(tMarks>=90)
			System.out.println("Grade A");
		else if(tMarks>=80 && tMarks<=89)
			System.out.println("Grade B");
		else if(tMarks>70 && tMarks<=79)
			System.out.println("Grade C");
		else if(tMarks>=60 && tMarks<=69)
			System.out.println("Grade D");
		else if(tMarks<60 && tMarks>0)
			System.out.println("Fail");
		else if(tMarks==0)
			System.out.println("No marks available to calcullate grade");
	}
}
