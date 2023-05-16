package OH;

public class pgm4 {

	public static void main(String[] args) 
	{
		String value = "my name is suresh";
		String[] words = value.split(" ");
		String ans = "";
		
		// Type1
		for (int i = 0; i < value.length(); i++) 
		{
			ans = value.charAt(i)+ans;
		}
		System.out.println(ans);
		
		// Type2
		String ans2 = "";
		for (int i = 0; i < words.length; i++) 
		{
			for (int j = words[i].length()-1; j >= 0 ; j--) 
			{
				ans2 =ans2+words[i].charAt(j);
			}
			ans2 = ans2+" ";
		}
		System.out.println(ans2);
	}

}
