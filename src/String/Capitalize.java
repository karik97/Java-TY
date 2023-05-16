package String;

public class Capitalize {

	public static void main(String[] args) {
		
		String []s="welcome my name kartik".split(" ");
		String capitalize="";
		
		for(String w:s) {
			capitalize+=w.substring(0,1).toUpperCase()+w.substring(1)+" ";
		}
         System.out.println(capitalize);
	}

}
