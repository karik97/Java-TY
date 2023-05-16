package String;

public class PrintEndingWithO {

	public static void main(String[] args) {
		
		String [] s="who am i".split(" ");
		
		for(int i=0; i<s.length; i++) {
			if(s[i].endsWith("0")) {//or we can use s[i].length-1
				System.out.println(s[i]);
			}
		}

	}

}
