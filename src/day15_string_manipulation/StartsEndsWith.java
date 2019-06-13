package day15_string_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
	
		String word1 = "eclipse";
		
		//startsWith ==> tests if string starts with another string
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ecl"));
		System.out.println(word1.startsWith("ecli"));
		System.out.println(word1.startsWith("eclip"));
		System.out.println(word1.startsWith("eclips"));
		System.out.println(word1.startsWith("Ec")); //false
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("se"));
		System.out.println(word1.endsWith("pse"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("lipse"));
		System.out.println(word1.endsWith("java")); //false
		
		System.out.println();
		System.out.println(word1.toUpperCase().endsWith("se")); //false
		System.out.println(word1.toUpperCase().endsWith("SE")); //true
		
		
		//Mr. ==> man
		//Mrs. ==> married woman
		//Ms. ==> Some woman
		//Dr. ==> Doctor man or woman
		// ==> unknown status
		
		String name = "Mrs John";
				
		if(name.startsWith("Mr")) {
			System.out.println("man");
		}else if(name.startsWith("Mrs")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms")){
			System.out.println("Some woman");
		}else if(name.startsWith("Dr")) {
			System.out.println("Doctor");
		}else {
			System.out.println("Unknown status");
		}
	}

}
