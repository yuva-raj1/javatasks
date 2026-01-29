package ladder_if_module;

public class UniversityAdmission {
	public String evaluateAdmission(int marks,boolean sportsAchievement) {
		if(marks>=95)
			return "Admitted with Scholarship";
		else if(marks<95 && marks>=85)
			return "Admitted without Scholarship";
		else if((marks<85 && marks>=70)&&(sportsAchievement==true))
			return "Admitted under sport Quota";
		else if(marks<70 && marks>=60)
			return "Interview Required";
		else 
			return "Admission Rejected";
					
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversityAdmission uao=new UniversityAdmission();
		System.out.println(uao.evaluateAdmission(85,true));

	}

}
