package groom;

public class larger_smaller {

	public static  void Small() {
		int [] arr= {7,2,0,1,5};
		int s=arr[0];
		for(int i=0; i<arr.length; i++)
		{		
				if(arr[i]<s)
				{
					s=arr[i];
				}				
		}
		System.out.println(s);	
	}
	
	public static  void Large() {
		int [] arr= {7,2,0,1,5};
		int l=arr[0];
		for(int i=0; i<arr.length; i++)
		{		
				if(arr[i]>l)
				{
					l=arr[i];
				}				
		}
		System.out.println(l);	
	}
	
	public static void main(String[] args) {
		Small();
		Large();
	}
}
