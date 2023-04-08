package JavaTY;

public class FindLargestNum {

	public static void main(String[] args) 
	{

		int []arr= {5,2,4,9};
		int largest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}


		}

		System.out.println(largest);	
	}

}
