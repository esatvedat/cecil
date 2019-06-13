package day23_LoopsAndArrays;

public class TrianglebyNested {
	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
//		for(int j=1; j<=10; j++) {
//			for(int i=1; i<j; i++) {
//				System.out.print(i+" ");
//			}
//			System.out.println(j+" ");
		//}
		
		for(int k=10; k>=10; k--) {
			for(int s=10; s>k; s--) {
				System.out.print(s+" ");
			}System.out.println(k+" ");
		}
	}
}
