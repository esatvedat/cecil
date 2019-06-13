package day51;

public class Assesment {
	int questionCount;
	int score;
	String type;
	
	//int our application all assesment has one shared timeLimit
	static int timeLimit = 45;
	
	//static method can only access static members
	public static void printTime() {
		System.out.println("Time limit " + timeLimit);
		

	}
	
	@Override
	public String toString() {
		return "Assesment [questionCount=" 
				+ questionCount +", score=" + score
				+ ", type=" + type + "]";
	}
	
}
