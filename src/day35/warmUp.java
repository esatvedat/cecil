package day35;

public class warmUp {
	public static void main(String[] args) {
		
	
	System.out.println(findLongestWord ("Ali","Mehmet","Mustafa"));
}
	public static String findLongestWord (String... arr) {
	 String longest =arr[0];
		
	 	for(int i=0; i<arr.length; i++) {
	 		if(arr[i].length()>=longest.length()){
			longest = arr[i];	
		 	}
	 	}
		return longest;
	}
		
//	for (String name : words) {
//	      if (name.length() >= longestWord.length()) {
//	        longestWord = name;
//	      }
//	    }
//
//	    return longestWord;
//	  }

	}
	
