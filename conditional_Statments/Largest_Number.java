package conditional_Statments;

public class Largest_Number {
	public int Largest(int q,int w,int e) {
		if(q>w && q>e)
			return q;
		else {
			if(w>q && w>e)
				return w;
			else 
				return e;
		}
	}
	public static void main(String[] args) {
	Largest_Number ln_o=new Largest_Number();
	System.out.println(ln_o.Largest(14, 15, 14));
	}

}
