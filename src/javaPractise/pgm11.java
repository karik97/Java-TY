package javaPractise;

public class pgm11 {

	public static void main(String[] args) {
		// swap the char only in reverse order
		String value = "a!@b$%cc";
		String ref = "";
		
		
		
		
		
		
		
		for (int i = 0; i < value.length(); i++) 
		{
			if(Character.isLowerCase(value.charAt(i)) || Character.isUpperCase(value.charAt(i)) || Character.isDigit(value.charAt(i)))
			{
				ref = ref+value.charAt(i);
			}
		}
		  int j=ref.length()-1;
		String fans ="";
		for (int i = 0; i < value.length(); i++) 
		{
			if(Character.isLowerCase(value.charAt(i)) || Character.isUpperCase(value.charAt(i)) || Character.isDigit(value.charAt(i))) 
			{
				fans = fans+ref.charAt(j);
				j--;
			}
			else
			{
				fans = fans+value.charAt(i);
			}
		}
		System.out.println(fans);
		

	}

}
