package Strings;

import java.util.LinkedHashSet;

public class PrintNoOfVowels {

	public static void main(String[] args) {
		
		String s="India".toLowerCase(); int c=0;
		LinkedHashSet<Character> lh = new LinkedHashSet<>();
		for(int i=0; i<s.length(); i++) {
			lh.add(s.charAt(i));
		}System.out.println(c);//System.out.println(lh);
		
		for(Character a:lh)
		{
			if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u') {
				c++;
			}
		}System.out.println(c+" without duplicate");
	}

}
