package SonyLogicalPrograms;

public class findMissingNumber {

	public static void main(String[] args) 
	{
		int[] number = {1,2,5,6,8};
		
		for(int i=0; i<=9; i++)
		{ 
			boolean flag = true;
			
			for (int j = 0; j < number.length; j++) 
			{
				if(number[j] == i )
				{
					flag = false;
				}
			}
			if(flag)
				System.out.println(i);
		}

	}

}
