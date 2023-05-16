package PRKQues;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String s="kartikcfgcgfxgdsaaa";

		int c[]=new int[26];
		
		for(int i=0; i<s.length(); i++) {
			int ch = s.charAt(i)-'a';
			c[ch]++;
			if(c[ch]==2) {
				System.out.print(s.charAt(i));
			}
		}

		//it will suitable for both charecter & string 
//		String []k="kartik is kartik is ak ak".split(" ");
//		
//		String res="";
//		for(int i=0; i<k.length; i++) {
//			if(res.indexOf(k[i])==-1) {
//				res+=k[i]+" ";
//			}
//		}System.out.println(res);
		
		
		
	}

}
