package String;

public class MaxLength_string {

	public static void main(String[] args) {
		String [] s="kartik i am".split(" ");
		int max=s[0].length();
		String word="";
		for(int i=0; i<s.length; i++) {
			
			if(s[i].length()>=max) {
				max=s[i].length();
				word=s[i];
			}
		}System.out.println(word+" "+max);
	}

}
