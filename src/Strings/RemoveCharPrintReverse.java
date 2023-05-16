package Strings;

public class RemoveCharPrintReverse {

	public static void main(String[] args) {
		
		char []s="my name kartik and my last name is gudisagar".toCharArray();

		for(int i=s.length-1; i>=0; i--) {

			if(s[i]=='a') {
				Character.toString(s[i]).replace("a", "");
			}
			else {
				System.out.print(s[i]);
			}
		}

	}

}
