package day09_Equals_conditions;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		//using ==
		System.out.println(str1==str2);  //true
		System.out.println(str1=="java"); //true
		System.out.println(str2 =="Java"); //false
		
		//equals method. PREFERRED WAY<====
		System.out.println(str1.equals(str2)); //true
		System.out.println(str2.equals("java")); //true
		System.out.println(str2.equals("Java")); //false
		
		//String month = "March";
		String month = new String("March");
		String month2 = new String("March");
		
		System.out.println(month == month2);   //shows false
		//Java is not doing values comparison
		//just checking if month and month2 are pointing to same location in memory.
		
		System.out.println(month.equals(month2));  //true
		System.out.println(month.equals("March")); //true
		
		//in the above examples by using equals method java s checking if values are same.
		//which s proper way of comparing strings.
		
		 
		
				
	
	}
}
