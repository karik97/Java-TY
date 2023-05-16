package collection;
import java.util.TreeSet;

public class Occurence {

	public static void main(String[] args) {
		
		
//		String s="aajnnaaannnnnaajhhhhhh";
//		
//		TreeSet<Object> ts=new TreeSet<>();
//		for(int i=0; i<s.length(); i++) {
//			ts.add(s.charAt(i));
//		}
//
//		System.out.println(ts);
//		for(Object t:ts) {
//			
//			for(int i=0; i<s.length(); i++) {
//				if(t.equals(s.charAt(i))) {
//					System.out.print(t);
//				}
//			}System.out.println();
//		}
//		
		
		String k="india";
		TreeSet<Character> st=new TreeSet<>();
		for(int i=0; i<k.length(); i++) {
			st.add(k.charAt(i));
		}
//		int c=0;
//		for(char ch:st) {
//	       
//			if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u') {
//				c++;
//			}
//		}System.out.println(c);
		
		
		//to print each char how many time repeating with count 
		for(char ch:st) {
			int ct=0;
			for(int i=0; i<k.length(); i++) {
				if(ch==k.charAt(i)) {
					ct++;
				}
			}
			//System.out.println(ch+" "+ct);
			//to print duplicate
			if(ct>1) {
				//System.out.println(ch+" "+ct);
			}
		}
		
		//to print line by line 
		for(Character set:st) {
			System.out.println(set);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
