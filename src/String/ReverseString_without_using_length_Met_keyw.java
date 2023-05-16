package String;

public class ReverseString_without_using_length_Met_keyw {

	public static void main(String[] args) {
		
		char[] k="kartik".toCharArray(); int c=0;
		for(char ch:k) {
			c++;
		}
		
		for(int i=c-1; i>=0; i--) {
			System.out.print(k[i]);
		}
		
		//With using third var
		String rev="";
		for(int i=c-1; i>=0; i--) {
			rev+=k[i];
		}
		System.out.println(rev);
	}

}
