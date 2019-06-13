package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
	String companyName = "Facebook";
	String address = "Silicon Valley, CA";
	int numberOfEmployees = 10000;
	Long revenue = 4000000L;
	boolean isTechCompany=true;
	 
	 System.out.println("Company name is " + companyName);
	 System.out.println("address is "+ address);
	 System.out.println("Number of employees is "+ numberOfEmployees);
	 System.out.println("Annual revenue is "+revenue);
	 System.out.println("is it tech company?-"+isTechCompany);
	 
	 System.out.println(companyName+isTechCompany);
	 //one side should be string
	 //+ can be used just for numbers. String+number
	 
	 System.out.println();
	 //gives empty line
	 //lets combine them
	 
	 String aboutCompany="Company " + companyName+" is located in "+address
			 + "\n  \t and "+numberOfEmployees+" employees work for it.";
	 //\n should be inside double quote for to show new line while printing.
	 //\t for tab
	 System.out.println(aboutCompany);
	 
	 
	}

}
 