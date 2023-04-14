package OrangeHealth;

public class pgm5 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,3,2,5,6,4,7,8};
		
		int first = arr[0];
		int second = arr[0]; 
		int third = arr[0];
		
		for(int i=0; i<arr.length;i++)
		 {
			 if(arr[i]>first)
			 {
				 first=arr[i];
			 }
			 else if(arr[i]>second)
			 {
				 second=arr[i];
			 }
			 else if(arr[i]>third)
			 {
				 third=arr[i];
			 }
		 }
		
		System.out.println(first+" "+second+" "+third);
	}
}
