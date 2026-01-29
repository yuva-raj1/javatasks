package operators;

public class updateScore {
	int score=2,bonus=4;
	public void upScore() {
//		int score,bonus;
		System.out.println(score+=bonus);
		System.out.println(score-=bonus);
		System.out.println(score*=bonus);
		System.out.println(score/=bonus);
		System.out.println(score%=bonus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateScore uso=new updateScore();
		uso.upScore();
		int q=56,t=43,c=0;
		System.out.println((q>t && t>c)||!(q==c));
	}

}
