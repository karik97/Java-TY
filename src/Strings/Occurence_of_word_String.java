package Strings;

import java.util.LinkedHashSet;

public class Occurence_of_word_String {

	public static void main(String[] args) {

		String s[] ="i am am from bangalore".toLowerCase().split(" ");
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		for(int i=0; i<s.length; i++) {
			lh.add(s[i]);
		}
		for(String set:lh) {
			int c=0;
			for(int j=0; j<s.length; j++)
			{
				if(set.equals(s[j])) {
					c++;
				}
			}System.out.println(set+" is present in "+c+" time");
			if(c>=2) {
				System.out.println(c+" duplicates");
			}
		}
	}

}
