package day49;

public class BarnesAndNoble {
	public static void main(String[] args) {
		AudioBook audiobook1 = new AudioBook("Leo Tolstoy", 9.99, 120, "War and Peace");
		System.out.println(audiobook1);
		
		audiobook1.setAuthor("Unknown");
		System.out.println(audiobook1);
		
	}

}
