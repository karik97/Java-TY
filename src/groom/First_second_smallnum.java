package groom;

public class First_second_smallnum {

	public static void main(String[] args) {
		
		int [] arr= {1,5,9};
		int fl=arr[0]; int sl=arr[0];  
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<fl)
			{
				sl=fl;
				fl=arr[i];				
			}
			else if(arr[i]<sl)
			{
				sl=arr[i];		
			}
		}System.out.println(fl); System.out.println(sl);
	}

}
