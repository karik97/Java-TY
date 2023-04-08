package Assignment;

import java.util.LinkedHashSet;

public class Occurence_Char_Without_Duplicates {
	//find occurnece of each char count no of duplicates /find position without duplicates
	public static void main(String[] args) {
		
        String st="TestYantra".toLowerCase();
        LinkedHashSet<Character> lh = new LinkedHashSet<>();
        for(int i=0; i<st.length(); i++) {
        	lh.add(st.charAt(i));
        }
        for(Character ch:lh) {
        	int c=0; 
        	for(int i=0; i<st.length(); i++)
        	{
        		if(ch==st.charAt(i)) {
        			c++;
        		}
        	}
        	System.out.println(ch+" is repeating "+c+" times");
        	if(c>1) System.out.println(c+" dupliactes area available");
        }		
	}

}
