package SonyLogicalPrograms;

public class reverseString {

	public static void main(String[] args) 
	{
		String value = "i love india"; //output: --> a idni evoli
		String value2 = value.replace(" ", "");
		String ans = "";
		int j = value2.length()-1;
		
		for (int i = 0; i < value.length(); i++) 
		{
			if(value.charAt(i)==' ')
			{
				ans = ans+" ";
			}
			else
			{
				ans = ans+value2.charAt(j);
				j--;
			}
		}
		System.out.println(ans);
		
		
		
	}

}
