package String;

public class PrintYourNamePattern {

	public static void main(String[] args) {
		

		String s="kartik";
		
		for(int i=0; i<s.length(); i++) {
			
			for(int j=0; j<=i; j++) {
				
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}

	}

}
