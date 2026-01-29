package conditional_Statments;

public class checkNumbr {
	public int findGreater(int n1,int n2) {
		if(n1>n2)
			return n1;
		else
			return n2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumbr cn_o=new checkNumbr();
		System.out.println("Greater number(10,25):"+cn_o.findGreater(10,25));
	}

}
