package OH;

public class pgm3 {

	public static void main(String[] args) 
	{
		String value = "apple appium application";
		String[] svalue = value.split(" ");
		String ans = "app";
		String fans = "";
		
		for (String word : svalue) 
		{
			if(word.startsWith(ans))
			{
				fans = word.substring(0,ans.length());
			}
		}
		System.out.println(fans);
	}

}
