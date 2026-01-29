package ins_stat_op;

public class Product {
	String p_name;
	int p_id;
	double p_price;
	void addp_details(String pr_name,int pr_id,double pr_prc) {
		p_name=pr_name;
		p_id=pr_id;
		p_price=pr_prc;
	}
	String display_details()
	{
		//System.out.println("product name:"+p_name+"prodcut id:"+p_id+"product price:"+p_price);
		return "product name:"+p_name+"\n"+"prodcut id:"+p_id+"\n"+"product price:"+p_price;
	}
	public static void main(String[] args) {
	Product pd=new Product();
	pd.addp_details("pradeep", 38, 45.235);
	System.out.println(pd.display_details());
	}
}
