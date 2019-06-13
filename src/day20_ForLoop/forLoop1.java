package day20_ForLoop;

public class forLoop1 {
	public static void main(String[] args) throws InterruptedException {
		//using for loop print "Love Java!" 10 times
		for(int i=1; i<=10; i++) {
			System.out.println("Love You Zeynep!");
			Thread.sleep(10);
	
		}
	//Print numbers from 5 to 15 using a for loop
		for(int n=5; n<=15; n++) {
			System.out.print(n+", ");
		}
		System.out.println();
		
	// For loop - print 20 to 10
		for(int j = 20; j>=10; j--) {
			System.out.print(j+" ");
			Thread.sleep(456);
		}
	
	}

}
