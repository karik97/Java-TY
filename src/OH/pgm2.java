package OH;

public class pgm2 {

	public static void main(String[] args) 
	{
		String value = "https";//h1t2p1s1
		
		for(int i=0; i<value.length(); i++)
		{
			int count = 0;
			for(int j=0; j<value.length(); j++)
			{
				if(value.charAt(i)==value.charAt(j))
				{
					if(j<i)
					{
						break;
					}
					count++;
				}
			}
			if(count>=1)
			{
				System.out.print(value.charAt(i)+" "+count);
			}
			
		}

	}

}
