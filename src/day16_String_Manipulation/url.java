package day16_String_Manipulation;

import java.util.*;
	public class url {

	public static void main(String[] args) {
		
		/* www.amazon.com
		 * com, net, edu, org, gov
		 * check that it starts with www.
		 * check it contains the ending dot right before the extension
		 * assign String domain and String extension
		 * print them
		 * "Domain:" amazon
		 * Extension:" com
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url: ");
		String url = scan.next();
		//check www.
		if(url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("Invalid url format ");
		return;
		}
		//check. is there right before extension
		//find out the length of the url
		//do -4 and using charAt get the character
		//compare if it is '.'
		//www.etsy.com
		
		int dotIndex = url.length() - 4;
		url.lastIndexOf(".");
		
		//if(url.charAt(dotIndex) == '.' ){
		//	System.out.println(". is there before extension");
		//}else {
		//		System.out.println(". might be misplaced");
		//	}
		
		//get domain and extension
		//www.yahoo.com
		
		String domain = url.substring(4, dotIndex);
		System.out.println("domain is: "+domain);
		String extension = url.substring(dotIndex+1, url.length());
		System.out.println("extension is: "+ extension);
		
	}

}
