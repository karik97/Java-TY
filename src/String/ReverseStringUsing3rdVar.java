package String;

public class ReverseStringUsing3rdVar {

	public static void main(String[] args) {
		
		String s="hello"; String rev="";
		for(int i=s.length()-1; i>=0;i--) {
			rev+=s.charAt(i);
		}
           System.out.print(rev);
	}

}
