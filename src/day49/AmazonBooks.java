package day49;

import day49_test.eBook;

public class AmazonBooks {
	public static void main(String[] args) {
		PaperBook book1 = new PaperBook();
		book1.author = "Mark Twain";
		book1.setTitle("The Adventures of Tom Sawyer");
		book1.chapterCount = 33;
		book1.price = 19.99;
		book1.pageCount = 274;
		System.out.println(book1);
		
		//book1 is an instance of book class?
		System.out.println(book1 instanceof Book);
		//true. because Book is a super class for PaperBook
		//Thus, book1 is an instance of Book too.
		//instanceof this is the keyword that indicates
		//if instance related to the class.
		//System.out.println(book1 instanceof Animal); ->not compile. should be same package
		
		eBook ebook1 = new eBook();
		ebook1.author = "Walter Savitch";
		//WHY ONLY author property is available?
		ebook1.setTitle("Java 8");
		System.out.println(ebook1);
		System.out.println("********************");
		AudioBook audiobook1 = new AudioBook("Leo Tolstoy", 9.99, 120, "War and Peace");
		System.out.println(audiobook1);
		
		
	}

}
