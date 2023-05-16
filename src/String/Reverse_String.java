package String;

public class Reverse_String {

	public static void main(String[] args) {
		String k="hi i am kartik";
		String [] s=k.split(" ");
//		//String rev=" ";
//      for(int i=s.length-1; i>=0; i--) {
//    	  
//    	 // rev=rev+s[i]+" ";
//      }
//      //System.out.print(rev.trim());
      
      for(int i=0; i<s.length; i++) {
    	 String ch = s[i];
    	 String rev="";
    	 for(int j=ch.length()-1; j>=0; j--) {
    		 rev=rev+ch.charAt(j)+" ";
    	 }
    	 System.out.print(rev.trim());
      }
      
      
	}

}
