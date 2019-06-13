package day54;

public class ProgrammingLanguage extends Language{

	public static void main(String[] args) {
	
		
	}
	
//	@Override
//	public void obeyGrammarRule() {
//		System.out.println("MUST OBEY THE SYNTAX RULE, are you sure?");
//		super.obeyGrammarRule();
//		
//	}
//	public final static void display() {
//		System.out.println("display language");
//	}
}
class Language{
	
	public final void obeyGrammarRule() {
		System.out.println("MUST OBEY THE SYNTAX RULE");
		
	}
	public final static void display() {
		System.out.println("display language");
	}
}

