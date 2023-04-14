package Sony;

public class dummy {

	public static void main(String[] args) {
		String value = "i love india";
		String value2 = value.replaceAll(" ", "");
		String rev = "";

		int j = value2.length()-1;

		for (int i = 0; i < value.length(); i++) 
		{
			if(value.charAt(i)==' ') 
			{ 
				rev = rev+" "; 
			}
			else
			{ 
				rev = rev+value2.charAt(j); 
				j--;
			}


		} 
		//System.out.println(rev);


		
		
		
		
		
		
		//countvalueisNotPrimePrint
		
		
		
		String value1 = "abcaeiba";

		for (int i = 0; i < value1.length(); i++) 
		{
			int alphcount =0;
			for (int j1 = 0; j1 < value1.length(); j1++) 
			{
				if(value1.charAt(i)==value1.charAt(j1))
				{
					if(j1<i)
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
					System.out.println(value1.charAt(i));
				}
			}
		}


	}

}
