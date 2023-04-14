package SonyLogicalPrograms;

public class ascendingOrder {

	public static void main(String[] args) 
	{
		int[] arr = {20,50,30,10,40};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	
	}
	
	
}
