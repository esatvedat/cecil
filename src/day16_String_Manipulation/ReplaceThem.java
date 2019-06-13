package day16_String_Manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		
		System.out.println(withNoSpaces);
		System.out.println(sentence);
		
		//replace , with !!!
		sentence = sentence.replace("," , "!!!");
		System.out.println(sentence);
		
		String mixed = "&^@$j$a-v|a@#$";  //lets clean it as become "java"

		mixed = mixed.replace("&^@$", "");
		//System.out.println(mixed);
		//mixed = mixed.replace("$", "");
		//System.out.println(mixed);     //goes like that OR:
		
		mixed = mixed.replace("$", "").replace("-", "").replace("|", "").replace("@", "").replace("#", "");
		System.out.println(mixed);
		
		
		String result = "About 115,000,000 results (0.59 seconds)";
		
		//using string methods(replace, substring) get number of results
		//115,000,000
		
		//result = result.replace("About ", "").replace(" results (0.59 seconds)", "");  -->it might break if the 0.59 seconds changes
			
		result = result.replace("About ", "");
		result = result.substring(0, result.indexOf(" "));
		//result = result.replace("About ", "").substring(0, 11); //another solution
		System.out.println(result);
		
		//result = result.replaceFirst("," , "");  //replace first comma replaceFirst
		result = result.replaceFirst(",", "");
		System.out.println(result);
		
		
	}

}
