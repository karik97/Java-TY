package javaPractise;

public class pgm2 {

	public static void main(String[] args) 
	{
		// Find the Missing Number
		int[] arr = {1,6,9};
		for(int i=1; i<=9; i++)
		{
			int count = 0;
			for(int j=0; j<arr.length; j++)
			{
				if(i==arr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}

	}

}
