package day12_switch_ternary;

public class SwitchScore {
	public static void main(String[] args) {
		char grade = 'D';
		//A or B or C -> Pass    D , E -> Fail   Invalid grade
		switch(grade) { //only equal statements checks
			case 'A':
			case 'B':
			case 'C':
				System.out.println("Pass");
				break;
			case 'D':
			case 'E':
				System.out.println("Fail");
				break;
			default: //you can put it anywhere in the switch/it works
				System.out.println("Invalid grade");
			//break; optional
		}
		
	}

}
