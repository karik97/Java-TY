package JavaTY;

import java.util.HashSet;

public class RemoveDuplicateInArray {

	public static void main(String[] args) 
	{
		int[]a= {6,4,4,6,2,18,20,5,10,1,16,19};//o/p2,4,6,5
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
			
		}
		
		System.out.println(set);
		
		
	}

}










/*int[]a= {2,4,4,6,5,6};//o/p2,4,6,5
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=9;
					
				}
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=9)
			{
				System.out.println(a[i]);
				
			}
				
		}*/