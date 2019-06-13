package day54;

public class WarmUp {

	int num = 100; //instance variable
	
	
	{
	//	num = 150;
		System.out.println("init block 1");
	}
	{
		//	num = 250;
			System.out.println("init block 2");
		}
	
	public WarmUp() {
		num = 200;
	}
	
	public WarmUp(int x) {
		System.out.println("cons with arg");
		num = 150;
		num = 400;
	}
	
	public static void main(String[] args) {
		WarmUp w = new WarmUp();
		System.out.println(w.num);
		
	
	}
}
