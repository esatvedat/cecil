package day49;
//PARENT CLASS
public class Book {
	protected String author;
	public int pageCount;
	public double price;
	public int chapterCount;
	private String title;
	
	
	public Book(String author, int pageCount, double price, int chapterCount, String title) {
		super();
		this.author = author;
		this.pageCount = pageCount;
		this.price = price;
		this.chapterCount = chapterCount;
		this.title = title;
		System.out.println("Book constructor with all args!");
	}
	public Book() {
	//	this(author, pageCount, price, chapterCount, title);
		System.out.println("Book constructor with no args");
	}
	public void setAuthor(String author) {
		System.out.println("Book class: setting author");
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		System.out.println("Book class: setting title");
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", pageCount=" + pageCount + ", price=" + price + ", chapterCount="
				+ chapterCount + ", title=" + title + "]";
	}
	
	
	

}
