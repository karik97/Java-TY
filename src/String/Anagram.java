package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		//length and both the string should hold the same value
		
		
		String k="karti";
		String r="kirti";
		
		
		if(k.length()==r.length()) {
			char [] rs=r.toCharArray();
			char[] ks = k.toCharArray();
			Arrays.sort(ks);
			Arrays.sort(rs);
			
			boolean status = Arrays.equals(ks, rs);
			if(status==true) {
				System.out.println(k+" "+r+" are anagram");
			}
			else
				System.out.println(k+" "+r+" are not a anagram");
		}
		
		else {
			System.out.println(k+" "+r+" are not a anagram");
		}
		
	}

}
