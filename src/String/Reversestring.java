package String;

public class Reversestring {

	public static void main(String[] args) {
		
		String s="Tester";

		for(int i=s.length()-1; i>=0; i--) {
			//System.out.print(s.charAt(i));
		}
		
		
		
		
		
		String k="a@*b#&c^!d";
		String ch="";
		String ref="";
		for(int i=0; i<k.length(); i++) {
			char c=k.charAt(i);
			
			if(Character.isDigit(c)|| Character.isUpperCase(c)|| Character.isLowerCase(c)) {
				ref+=c;
			}
		}
		int cs = ref.length()-1;
		String ans="";
		for(int j=0; j<k.length(); j++) {
           
			char c=k.charAt(j);			
			if(Character.isDigit(c)|| Character.isUpperCase(c)|| Character.isLowerCase(c)) {
				ans+=ref.charAt(cs);
				cs--;
			}else {
				ans+=c;
			}			
		}
		
		System.out.println(ans);
	}

}
