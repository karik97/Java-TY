package javaPractise;

public class pgm7 {

	public static void main(String[] args) {
		// Reverse the String along with Specific space
		String value = "hi hello welcome";
		String value2 = value.replaceAll(" ", "");
		
		String fans = " ";
		int j = value2.length()-1;
		
		for (int i = 0; i < value.length(); i++) 
		{
			if(value.charAt(i)==' ')
			{
				fans = fans+" ";
			}
			else
			{
				fans = fans+value2.charAt(j);
				j--;
			}
		}
		System.out.println(fans);

	}

}
