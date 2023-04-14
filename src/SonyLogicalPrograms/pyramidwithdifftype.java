package SonyLogicalPrograms;

public class pyramidwithdifftype {

	public static void main(String[] args) 
	{
		int row =1;
		int row1 = row-1;
		int space = row-1;
		int star = 1;
		
		
		for (int i = 1; i <= row; i++) 
		{
			for (int k = 0; k < space; k++) 
			{
				
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) 
			{
				
				System.out.print("*");
			}
			if(i>1)
			{
				int value = i-1;
				//System.out.println(i+"---->"+ i+1);
				for(int i1=i; i1<i+value; i1++)
				{
					for (int k = 0; k < 1; k++) 
					{
						System.out.print(" ");
					}
					for (int j = 0; j < 1; j++) 
					{
						System.out.print("*");
					}
					
				}
			}
			System.out.println();
			space--;
			
		}
			int space1 = 1;
			int star1 = 1;
			for (int i = 1; i <= row1; i++) 
			{
				for (int k = 0; k < space1; k++) 
				{
					
					System.out.print(" ");
				}
				for (int j = 0; j < star1; j++) 
				{
					
					System.out.print("*");
				}
				if(i>0)
				{
					
					//System.out.println(i+"---->"+ i+1);
					for(int i1=i; i1<row1; i1++)
					{
						if(i==row1)
							break;
						for (int k = 0; k < 1; k++) 
						{
							System.out.print(" ");
						}
						for (int j = 0; j < 1; j++) 
						{
							System.out.print("*");
						}
						
					}
				}
				System.out.println();
				space1++;
				
			}	
		

	}

}
