package Strings;

public class Minimum_Length_String {

	public static void main(String[] args) {
		
	
		String []a={"ab","abc","abcd","dgfh","ed"};
		
		String minlength = a[0];
		for(int k=0; k<a.length; k++) {
			if(a[k].length()<minlength.length()) {
				minlength=a[k];
			}
		}
		for(int o=0; o<a.length; o++) {
			if(a[o].length()==minlength.length()) {
				System.out.println(a[o]);
			}
		}
	}

}
