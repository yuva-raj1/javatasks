package conditional_Statments;

public class checkVowel {
	public String isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o')
			return "Vowel";
		else
			return "Consonant";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkVowel cv_ob=new checkVowel();
		System.out.println(cv_ob.isVowel('w'));
		
	}

}
