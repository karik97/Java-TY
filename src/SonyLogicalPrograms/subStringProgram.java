package SonyLogicalPrograms;

public class subStringProgram {

	public static void main(String[] args) 
	{
		String value = "SureshKumar";
		int substr = 2;
		
		for (int i = substr; i <= value.length(); i++)
		{
			System.out.println(value.substring(i-substr, i));
			
		}
		

	}

}
