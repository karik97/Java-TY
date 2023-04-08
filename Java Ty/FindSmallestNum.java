package JavaTY;

public class FindSmallestNum {

	public static void main(String[] args)
	{
		int []arr= {5,2,4,9};
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
			
			
		}

	System.out.println(smallest);	
		
	}

}
