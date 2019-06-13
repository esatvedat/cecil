package day33;

public class GraderApp {
	public static void main(String[] args) {
		/*
		 * grade your score by range and give grade of A B C F
		 */
		
		System.out.println(gradeTheScore(7));
	}
	public static char gradeTheScore(int score) {
		
		if (score <= 100 && score >= 90) return 'A';
		if (score < 90 && score >= 80) return 'B';
		if (score < 80 && score >= 70) return 'C';
		return 'F';
		
	}
	

}
