package elcblc_demo;

public class ShoppingCart {

	public static void main(String[] args) {
		Product p_obj1=new Product();
		Product p_obj2=new Product();
		p_obj1.setProductId(123);
		p_obj1.setProductName("Nyka");
		p_obj1.setPrice(159);
		p_obj1.setQuantity(2);
		System.out.println(p_obj1.displayInfo());
		p_obj2.setProductId(153);
		p_obj2.setProductName("ADIDAS");
		p_obj2.setPrice(897);
		p_obj2.setQuantity(12);
		System.out.println(p_obj2.displayInfo());
		
		
	}

}
