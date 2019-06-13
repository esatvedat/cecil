package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temperature = 65;
		
		if(temperature >= 65) {
			System.out.println("Its is a nice day! Lets code java");
			
		}else {
			System.out.println("Stay home and code java");
			
		}
		
		//2 int variables, teamAScore, teamBScore
		//put a condition. check if teamA won. 
		//If yes, print "Team A won!"
		//Go Team A!
		//else "Team b won or it was a draw"
		//Go Teams!
		
		int teamAScore, teamBScore;
		teamAScore = 5;
		teamBScore = 15;
		
		if(teamAScore>teamBScore) {
			System.out.println("Team A won!" + "\nGo Team A");
			
		}else {
			System.out.println("Team b won or it was a draw" + "\nGo Teams!");
		}
	}
}