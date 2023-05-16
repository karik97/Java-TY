package String;

public class FrequancyEachChar {

	public static void main(String[] args) {
		
		String s="aaabbbbgggvvvdd";
		
		for(int i=0; i<s.length(); i++) {
			int c=1;
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
					i++;
				}else
					break;
			}
			System.out.print(s.charAt(i)+""+c+" ");
		}

	}

}

