package day18_while_dowhile_loops;

public class Counter {
	public static void main(String[] args) throws InterruptedException {
		//1, 2,3,4,5,6,7,8,9,10
		int num = 1;
		while(num<=10) {
			System.out.print(num+", ");
			num++;
			Thread.sleep(100); //pause the code execution for a second
		}
		//11, 10, 9, 8,7,6,5,4,3,2,1
		System.out.println();
		int num2 = 11;
		while(num2>=1) {
			System.out.print(num2+",");
			num2--;
			Thread.sleep(100);
			
		}System.out.println();
		System.out.println(num2);
}
}
