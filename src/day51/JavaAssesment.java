package day51;

public class JavaAssesment extends Assesment{
	
	int level;
//	int questionCount;
//	int score;
//	String type;
//	static int timeLimit;
	
	public static void main(String[] args) {
		//static way to access .timeLimit
		System.out.println(Assesment.timeLimit);
		//accessing inherited static field directly in static method
		System.out.println(timeLimit);
		//accessing inherited static field in static way
		//using this className
		System.out.println(JavaAssesment.timeLimit);
		
		Assesment.printTime();
		printTime();
		JavaAssesment.printTime();
		
	}

//	//static method can only access static members
//		public static void printTime() {
//			System.out.println("Time limit " + timeLimit);
//			
//
//		}
//		
//		@Override
//		public String toString() {
//			return "Assesment [questionCount=" 
//					+ questionCount +", score=" + score
//					+ ", type=" + type + "]";
//		}
//		
//	}

}
