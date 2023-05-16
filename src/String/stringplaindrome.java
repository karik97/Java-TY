package String;

public class stringplaindrome {

	public static void main(String[] args) {
		
		String s="pop";
		
		String rev="";
		
		for(int i=0; i<s.length(); i++) {
			rev+=s.charAt(i);
		}
        if(rev.equals(s)) System.out.println(rev+" is a plaindrome");
        else System.out.println(rev+" not a palindrome");
	}

}
