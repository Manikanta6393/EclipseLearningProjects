package example;

public class Book {
int bookCode;
String title;
double price ;
static int countBooks=0;

public Book(){
  countBooks++;
}
public Book(int bookCode, String title, float price){
  countBooks++;
  this.bookCode=bookCode;
  this.title=title;
  this.price = price;
  System.out.println(countBooks);
}
public int getBookCode() {
	return bookCode;
}
public void setBookCode(int bookCode) {
	this.bookCode = bookCode;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public static int getCountBooks() {
	return countBooks;
}
public static void setCountBooks(int countBooks) {
	Book.countBooks = countBooks;
}

}
