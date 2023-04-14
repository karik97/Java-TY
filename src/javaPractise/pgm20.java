package javaPractise;

public class pgm20 {

	public static void main(String[] args) {
		// Find the Possible Substring
		
		String value  = "aabbaa";
		
		for (int i = 0; i < value.length()-1; i++) 
		{
			System.out.println(value.substring(i, i+2));
		}

	}

}
