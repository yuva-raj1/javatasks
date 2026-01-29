package elcblc_demo;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	public void setProductId(int pid) {
		productId=pid;
	}
	public void setProductName(String pnm) {
		productName=pnm;
	}
	public void setPrice(int p_pr) {
		price=p_pr;
	}
	public void setQuantity(int qt) {
		quantity=qt;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public String displayInfo() {
		return "product-Id:"+productId+"\nproduct_Name:"+productName+"\nproduct_price:"+price+"\nproduct_quantity:"+quantity;
	}
		

	

}
