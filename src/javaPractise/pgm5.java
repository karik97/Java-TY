package javaPractise;

public class pgm5 {

	public static void main(String[] args) {
		// Find The Matching Char and Print It in the ASCII Value
		String value = "dabDhgiB";
		char com = 'A';
		
		for (int i = 0; i < value.length(); i++) 
		{
			char ref = value.charAt(i);
			if(Character.isUpperCase(ref))
			{
				if(value.indexOf(Character.toLowerCase(ref))!= -1)
				{
					if(com<ref)
					{
						com=ref;
					}
				}
			}
		}
		System.out.println(com);

	}

}
