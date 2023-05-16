package String;

public class Vowels {

	public static void main(String[] args) {

		String [] arr= {"bangalore","chennai","newyork"};

		for(int i=0; i<arr.length; i++) {
			String a=arr[i];
           int c=0;
			for(int j=0; j<a.length(); j++ ) {
				char ch = a.charAt(j);
				
				if(ch=='a'|| ch=='e' || ch=='e'|| ch=='i' ||ch=='o'||ch=='u') {
					c++;
				}
			}
			System.out.println(c+" "+arr[i]);
		}
		
		
		//with single loop print all array above input
		int s=0;
		int ct=0;


		for(int i=0; i<arr[s].length(); i++) {
			
			char c=arr[s].charAt(i);
			
			if("AEIOUaeiou".contains(Character.toString(c))) {
				
				ct++;
				
				if(i==arr[s].length()-1) {
					
					System.out.println(arr[s]+" "+ct);
					s++;
					i=-1;
					ct=0;					
				}
			}
		   else{
			   if(i==arr[s].length()-1) {
				   System.out.println(arr[s]+" "+ct);
			   }
			}
		
		
//		String s="";
//		for(int i=0; i<arr.length; i++) {
//			String a=arr[i];
//			int c=0;
//			for(int j=0; j<a.length(); j++ ) {
//				char ch = a.charAt(j);
//				
//				if(ch=='a'|| ch=='e' || ch=='e'|| ch=='i' ||ch=='o'||ch=='u') {
//					if(s.indexOf(ch)==-1)
//					{
//						s+=ch;
//						c++;
//					}
//				}
//			}System.out.println(s+" "+c);
//		}
		
		String []k="im feeling sleepy".split(" ");
		
		for(int i=0; i<k.length; i++) {
			int count=0;
			String c = k[i];
			for(int j=0; j<c.length(); j++) {
				char ch = c.charAt(j);
				if(ch=='a'|| ch=='e' || ch=='e'|| ch=='i' ||ch=='o'||ch=='u') {
					
					count++;
				}
			}
		//	System.out.println(k[i]+" "+count);
		}
		
		
		

	}

}
