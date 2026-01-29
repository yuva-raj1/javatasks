package elcblc_demo;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		//Book b2=new Book();
		b1.setBookId(101);
		b1.setTitle("Naa Anveshana");
		b1.setAuthor("Avinash dasari");
		b1.setPrice(9669);
		String avi=b1.getviewDetails();
		System.out.println(avi);
		}
}
