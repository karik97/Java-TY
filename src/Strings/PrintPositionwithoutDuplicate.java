package Strings;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PrintPositionwithoutDuplicate {

	public static void main(String[] args) {
	
		String st="Tester".toLowerCase();//t=1 e=2 s=3 r=6
        LinkedHashSet<Character> lh = new LinkedHashSet<>();
        for(int i=0; i<st.length(); i++) {
        	lh.add(st.charAt(i));
        }
        for(Character ch:lh) {
        	
        	for(int i=0; i<st.length(); i++)
        	{
        		if(ch==st.charAt(i)) {
        			//System.out.println(ch+" is in "+(i+1)+" position");
        			break;
        		}
        	}
        	
        }		

        String st1="Tester".toLowerCase();//t=4 e=5 s=3 r=6
        LinkedHashSet<Character> lh1 = new LinkedHashSet<>();
        for(int i=0; i<st1.length(); i++) {
        	lh1.add(st1.charAt(i));
        }
        for(Character ch:lh1) {
        	
        	for(int i=st1.length()-1; i>=0; i--)
        	{
        		if(ch==st1.charAt(i)) {
        			System.out.println(ch+" is in "+(i+1)+" position");
        			break;
        		}
        	}
        	
        }		
        
	}

}
