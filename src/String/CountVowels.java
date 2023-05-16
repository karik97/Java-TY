package String;

public class CountVowels {

	public static void main(String[] args) {

		String s="sdmedcneaioaiowkdjckck";

		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if("AEIOUaeiou".contains(Character.toString(ch))) {
				//System.out.println(ch);//if i want count of vowels intialoze count with zero c++ here outside the loop print 
			}
		}

		//System.out.println(s.indexOf(5));

		//if(!"AEIOUaeiou".contains(s))
		//remove  duplicates get only unique vowels
		
			//Character.getNumericValue(0);
			
		String s2="";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if("AEIOUaeiou".contains(Character.toString(c))) {
				if(s2.indexOf(c)==-1) {
					s2+=c;
					
				}
			}
		}
		System.out.println(s2);
		
		
		//print unique vowels count 
		
//		String s2="";
//		int count=0;
//		for(int i=0; i<s.length(); i++) {
//			char c = s.charAt(i);
//				if(s2.indexOf(c)==-1) {
//					s2+=c;
//					if(c=='a'|| c=='e' || c=='e'|| c=='i' ||c=='o'||c=='u') {
//						count++;
//				}
//			}
//		}
//		System.out.println(count);
//		
		
		
	}

}
