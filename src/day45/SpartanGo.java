package day45;

public class SpartanGo {
	public static void main(String[] args) {
		
		Spartan s1 = new Spartan();
		System.out.println(s1);
		
		String[] certs = {"OCA", "PSM", "AWS", "OCP"};
		
		Spartan s2 = new Spartan("Coder", 8, 600, false, certs);
		Spartan s3 = new Spartan("Coder1", 18, 600, false, new String[] {"OCA"});
		Spartan s4 = new Spartan("Coder2", 12, 200, false, new String[] {});
		Spartan s5 = new Spartan("Coder3", 3, 100, true, null);
		
		//we are printing object directly
		
		System.out.println(s2);
		
		System.out.println(s2.toString());
		System.out.println(s4); //certificates=[]
		System.out.println(s5); //certificates = null
		
		
	}

}
