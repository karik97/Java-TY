package javaPractise;

import java.util.HashSet;

public class pgm8 {

	public static void main(String[] args) {
		// Find the First Matching Char with using Single Loop
		String value  = "selenium";
		
		HashSet<Object> ref = new HashSet<>();
		for (int i = 0; i < value.length(); i++) 
		{
			if(ref.add(value.charAt(i))==false )
			{
				System.out.println(value.charAt(i));
				//break;
			}
		}

	}

}
