package SonyLogicalPrograms;

public class reverseArray {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,3,4,5};
		
		int i = arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}
		
	}

}
