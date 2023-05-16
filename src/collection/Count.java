package collection;

import java.util.TreeSet;

public class Count {

	public static void main(String[] args) {
		
		
		String[] s="im indian citizen indian resident".split(" ");
		TreeSet<Object> ts=new TreeSet<>();
		
		for(int i=0; i<s.length; i++) {
			ts.add(s[i]);
		}

		for(Object set:ts) {
			int c=0;
			for(int i=0; i<s.length; i++) {
				if(set.equals(s[i])) {
					c++;
				}
			}
			System.out.println(set+" "+c);
			if(c==1) {
				//System.out.println(set+" "+c);
			}else {
				//System.out.println(set+" "+c);
			}
		}
		
		String k="india";
		TreeSet<Object> t=new TreeSet<>();
		for(int i=0; i<k.length(); i++) {
			t.add(k.charAt(i));
		}
		
		for(Object so:t) {
			for(int j=0; j<k.length(); j++) {
				if(so.equals(k.charAt(j))) {
				//System.out.println(j+" "+so);
				break;// if u want unique without duplicate 
				}
			}
		}
	     
		String [] o="katam tatta bye bye".split(" ");
		
		TreeSet<Object> e=new TreeSet<>();
		
		for(int i=0; i<o.length; i++) {
			e.add(o[i]);
		}
		
		for(Object set:e) {
			for(int j=0; j<o.length; j++) {
				if(set.equals(o[j])) {
					System.out.println(set+" "+j);
					break;// if u want unique without duplicate 
				}
			}
		}		
	}

}
