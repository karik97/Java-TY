package Strings;

public class ReverseString {

	public static void main(String[] args) {

        String k="kartik";
        String rev=" ";
        for(int i=k.length()-1; i>=0; i--)
        {
        	rev=rev+k.charAt(i);
        }//System.out.println(rev);

       char[] a = "kartik".toCharArray();
       for(int i=a.length-1; i>=0; i--) {
    	   System.out.println(a[i]);
       }
       
        String r = "kartik";
        for(int i=r.length()-1; i>=0; i--)
        {
        	//System.out.println(r);
        }
        
        char[] a1 = "kartik".toCharArray();
        int c=0;
        for(Character ch:a1) {
        	c++;
        }
        for(int i=c-1; i>0; i--) {
     	   //System.out.println(a1[i]);
        }
	}

}
