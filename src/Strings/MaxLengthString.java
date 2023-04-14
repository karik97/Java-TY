package Strings;

public class MaxLengthString {

	public static void main(String[] args) {
		
		String []a={"ab","abc","abcd","dgfh","ed"};
		String maxlength = a[0];
		for(int k=0; k<a.length; k++) {
			if(a[k].length()>maxlength.length()) {
				maxlength=a[k];
			}
		}
		for(int o=0; o<a.length; o++) {
			if(a[o].length()==maxlength.length()) {
				System.out.println(a[o]);
			}
		}
	}

}
