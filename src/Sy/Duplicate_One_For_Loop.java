package Sy;

public class Duplicate_One_For_Loop {
	//input: selenium 
	//print the first duplicate letter(use only one forloop)
	//output: e
	public static void main(String[] args) {

		String s="selenium";

		int [] seen= new int [26];

		for(int i=0; i<s.length(); i++) {
			int index = s.charAt(i) -97;
			seen[index]++;
			if(seen[index]==2) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
