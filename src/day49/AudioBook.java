package day49;
//CHILD CLASS
final public class AudioBook extends Book{
	public double length;
	public double size;
	
	public AudioBook(String author, double price, int chapterCount, String title) {
		super(author, 0, price, chapterCount, title);
		System.out.println("Hello from audiobook constructor!");
	}

	public void setAuthor(String author) {
		//we are calling parent method setAuthor of method setAuthor
		super.setAuthor(author);
		System.out.println("Book class: setting author");
		this.author = author;
	}
	

}
