package ins_stat_op;

public class Book {
	String bookTitle;
	String author;
	int isbn;
	public void addbookdetails(String b_title,String b_author,int b_isbn) {
		bookTitle=b_title;
		author=b_author;
		isbn=b_isbn;
	}
	public String displaydetails() {
		return "bookTitle:"+bookTitle+"author:"+author+"isbn:"+isbn;
	}
	public static void main(String[] args) {
	Book b=new Book();
	b.addbookdetails("Naa Ishtam","RGV",4554);
	System.out.println(b.displaydetails());
	}
	

}
