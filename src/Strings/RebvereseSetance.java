package Strings;

public class RebvereseSetance {

	public static void main(String[] args) {
		
		String[] k = "i am from bangalore".split(" ");//bangalore from am i 
		 for(int i=k.length-1; i>=0; i--) {
			// System.out.print(k[i]+" ");
		 }
		 

		 String[] k1 = "i am from bangalore".split("");//erolagnab morf ma i
		 for(int i=k1.length-1; i>=0; i--) {
			// System.out.print(k1[i]);
		 }
		 
		 String[] k11 = "i am from bangalore".split(" ");//i ma morf erolagnab 
		 for(int i=0; i<k11.length; i++) {
		    // String s = k11[i];
		     for(int j=k11[i].length()-1;j>=0; j-- ) {
		    	 System.out.print(k11[i].charAt(j));
		     }System.out.print(" ");
		 }
		 
		 String[] j = "i am from bangalore".split(" ");
		//String temp= j[0];
		String temp=j[3]; 
		j[3]=j[0];
		j[0]=temp;
		//j[0]=j[j.length-1];
		//j[j.length-1]=temp;
		 for(int i=0; i<j.length; i++) {
			// System.out.print(j[i]+" ");
		 }
		 
	}

}
