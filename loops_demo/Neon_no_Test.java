package loops_demo;
//Write a javaporgram to find the  Number is Neon Number or Not 
public class Neon_no_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num,res=num;
		
		for(int num=1;num<=100;num++) {
			int res=num;
			int num_sq=num*num;
			int sum=0;
				while(num_sq!=0) {
					int n_s=num_sq%10;
					sum+=n_s;
					num_sq=num_sq/10;
				}
		if(res==sum)
			System.out.println("Neon number"+num);
		else
			System.out.println("not a neon number"+num);
	}
	}
}
