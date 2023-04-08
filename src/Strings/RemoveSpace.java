package Strings;

public class RemoveSpace {

	public static void main(String[] args) {
		//without inbuilt method
		 String[] k = "i am from bangalore".split(" ");//iamfrombangalore
		 for(int i=0; i<k.length; i++) {
			 //System.out.print(k[i]);
		 }
		 
		
		 String k1 = "i am from bangalore";
		 System.out.print(k1.replace(" ", ""));
	}

}
