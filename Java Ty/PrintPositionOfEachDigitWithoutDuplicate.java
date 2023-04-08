package JavaTY;

import java.util.LinkedHashSet;

public class PrintPositionOfEachDigitWithoutDuplicate {

	public static void main(String[] args) 
	{

		int[]a= {2,4,8,4,6,5,6,3,2,2,4};

		LinkedHashSet<Integer>set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);

		}
		for(Integer m:set)
		{
			int count=0;

			for(int i=0;i<a.length;i++)
			{
				if(m==a[i])
				{
					System.out.println(m+" is in " +(i+1)+" position");
				}

			}
			
		}
	}

}
