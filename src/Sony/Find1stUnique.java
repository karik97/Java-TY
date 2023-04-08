package Sony;

//String s="aabbcdef"; Find the first non-duplicate character

public class Find1stUnique {

	public static void main(String[] args) {
		
		char []s="aabbcdef".toCharArray();
		
		for(int i=0; i<s.length; i++) {
			int c=1;
			for(int j=0; j<s.length; j++) {
				
				if(i!=j && s[i]==s[j]) {
					c++; break;
				}
			}
			if(c==1) {
				System.out.println(s[i]);break;
			}
		}
	}
}
