package Sony;

public class Selenium_Pattern {
	/*
	  input: selenium
       output: s
	            se
	            sel
	            sele
	            selen
	            seleni
	            seleniu
	            selenium
	 */

	public static void main(String[] args) {

		String s="selenium";
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<s.length(); j++) {
				if(i>j) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
