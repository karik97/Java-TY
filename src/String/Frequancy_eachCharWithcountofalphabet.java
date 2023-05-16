package String;

public class Frequancy_eachCharWithcountofalphabet {

	public static void main(String[] args) {

		String s="aaabbbbgggvvvd";
		int fc=0;
		for(int i=0; i<s.length(); i++) {
			int c=1; 
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
					i++;
				}else
					break;;
			}
			
			if(c>1) {
				fc++;
			}
		}System.out.println(fc);


	}

}
