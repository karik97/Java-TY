package String;

import java.util.Arrays;

public class string {

	public static void main(java.lang.String[] args) {
		
		char [] ch="kartik".toCharArray();
		
//       for(int i=0; i<ch.length(); i++){
//    	   System.out.println(ch.charAt(i));
//       }
		
		//to print in array
		System.out.println(Arrays.toString(ch));
		
		
		//to print line by line
		 for(int i=0; i<ch.length; i++){
	    	   System.out.println(ch[i]);
       }
		
	}

}
