package day34;

public class Palindrom {
	
		/*
		 * write a function to test a String is a palindrome
		 * static method called isPalindrome
		 * it takes one String as a parameter
		 * return boolean
		 * 		for example : ana --> ana , level
		 * 					race car -->
		 * space does not matter
		 * 
		 * OPTIONALLY : Use your existing method called reserveString
		 * 
		 */
		
	
	public static boolean isPalindrome(String target) {
		String reversed = "";
		target = target.replaceAll(" ", "");
		
		
		
		for (int i = target.length() - 1; i >= 0; i--) {

			System.out.println(target.charAt(i));
			reversed += target.charAt(i) + "";
		}
		if (reversed.equals(reversed)) {
			
			return true;
		} else {
			return reversed.equals(target);
		}

}

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("hannah"));
	}

//		String palindrom = "Mansur";
//		isPalindrom(palindrom);
//
	}

		 
//		 String str1 = "";
//	        for(int i=str.length()-1; i>=0; i--) {
//	            str1 = str1 + str.charAt(i);
//	        }
//	        if(str.equals(str1)) {
//	            return "true";
//	        } else {
//	            return "false";
//	    }
//	    }
		
//		String a = str.replace(" ", "");
//		String b = "";
//		
//		boolean TF;
//        int n = a.length();
//        for(int i = n - 1; i >= 0; i--)
//        {
//            b = b + a.charAt(i);
//        }
//        if(a.equalsIgnoreCase(b))
//        {
//            TF = true;
//        }
//        else
//        {
//            TF = false;
//        }
//		
//		
//		return TF;
//		
//	}
//
//}
		
		

