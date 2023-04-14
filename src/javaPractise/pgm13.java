package javaPractise;

public class pgm13 {

	public static void main(String[] args) {
		// Take two value and add input: 123 Output: 1+2=3, 1+3=4, 2+3=5 ans is 3,4,5
		
		int[] arr = {1,2,3};
		for(int i=0; i<arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				System.out.println(arr[i]+arr[j]); 
			}
		}

	}

}
