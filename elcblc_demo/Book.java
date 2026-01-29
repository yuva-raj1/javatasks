package elcblc_demo;

public class Book {
 int bookId;
 String title;
 String author;
 double price;
 public void setBookId(int bid) {
	 bookId=bid;
 }
 public void setTitle(String bt) {
	 title=bt;
 }
 public void setAuthor(String bauthor) {
	 author=bauthor;
 }
 public void setPrice(int bpr) {
	 price=bpr;
 }
 public int getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
 public String getviewDetails()
 {
	 return "BookId:"+bookId+"\nBookTitle:"+title+"\nBookauthor:"+author+"\nBook Price:"+price ;
 }
}
