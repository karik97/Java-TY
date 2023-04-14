package SonyLogicalPrograms;

public class occurenceProgram {

	public static void main(String[] args) 
	{
		String value = "aaabbbssssddcaaabb";
		int count = 0; int i;
		
		for (i = 0; i < value.length(); i++) 
		{
			if(i == value.length()-1)
			break;
			
			if(value.charAt(i)==value.charAt(i+1))
			{
				count++;
			}
			else
			{
				count++;
				System.out.println(value.charAt(i)+"----->"+count);
				count = 0;
			}
		}
		 count++; 
		 System.out.println(value.charAt(i)+"----->"+count);
		

	}

}
