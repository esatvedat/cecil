package Day31_Methods_void;

public class Counter {
	public static void main(String[] args) {
	countUp(-1);
	countDown(0);
		
	}
public static void countUp(int count) {
	if(count<1) {
		System.out.println("invalid input");
	}
	for(int i=1; i<=count; i++) {
	System.out.print(i+" ");
	}System.out.println();
}

public static void countDown(int count) {
	if(count<=0) {
		System.out.println("invalid input");
	}
	for(int i=count; i>0; i--) {
		System.out.print(i+" ");
	}
	
}
}
