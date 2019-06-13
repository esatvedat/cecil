package day35;

public class MethodOverloading4 {
	public static void main(String[] args) {
		//ANY literal non-fractional numbers will be seen as int
		//ANY literal fractional numbers will be seen as double
		
		double d;
		
		d = 10;
		System.out.println(d);
		d = 10L;
		System.out.println(d);
		d = 10F;
		System.out.println(d);
		
		release(10);
		release(10L);
		release(10F);
		release(10d);
		release((short)10);
		release(10.5);
		release((byte)10);
		release(15/2);
		release(7.5);
	
	}
	public static void release(float d) {
		System.out.println("float " + d);
	}
	public static void release(double d) {
		System.out.println("double " + d);
	}

	public static void release(int d) {
		System.out.println("int " + d);
	}
	
}
