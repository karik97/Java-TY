package SyLgicaPro;

public class ifcountvalueisNotPrimePrint {

	public static void main(String[] args) 
	{
		String value = "kartik";

		for (int i = 0; i < value.length(); i++) 
		{
			int alphcount =0;
			for (int j = 0; j < value.length(); j++) 
			{
				if(value.charAt(i)==value.charAt(j))
				{
					if(j<i)
					{
						break;
					}
					alphcount++;
				}
			}
			if(alphcount>=1)
			{
				//System.out.println("--->"+value.charAt(i));

				int number = alphcount;
				int count = 0;
				for(int i1=1; i1<=3; i1++)
				{
					if(number%i1==0)
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(value.charAt(i));
				}
			}
		}
	}
}		







