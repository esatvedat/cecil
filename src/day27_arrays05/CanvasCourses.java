package day27_arrays05;

public class CanvasCourses {
	public static void main(String[] args) {
	
		String url = "https://.learn.cybertekscool.com/courses/149";
		/*
		 * 147 Java programming
		 * 204 Mentoring Sessions
		 * 149 SDLC
		 * 152 QA Testing
		 * 144 Team activity
		 * 143 Welcome Kit
		 * Others -> Unknown code
		 */
		String[] words = url.split("/");
		//convert it to the integer. Integer.parseInt(...) ->int value
		// switch statement find matching
		
		//System.out.println(words[words.length-1]);
	
		int code = Integer.parseInt(words[words.length-1]);
		
		switch (code) {
			case 147 :
				System.out.println("Java Programming");
			break;
			case 204 :
				System.out.println("Mentoring sessions");
			break;
			case 149 :
				System.out.println("SDLC");
			break;
			case 152 :
				System.out.println("QA Testing");
			break;
			case 144 :
				System.out.println("Team activity");
			break;
			case 143 :
				System.out.println("Welcome Kit");
			break;
			default :
				System.out.println("Unknown code");
		
		}	
	}
}
