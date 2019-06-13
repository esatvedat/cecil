package day34;

public class CMDArgument {
	public static void main(String[] args) {
		System.out.println(args.length);
	
		for(String item : args) {
			System.out.print(item + " ");
		}
	}

}
