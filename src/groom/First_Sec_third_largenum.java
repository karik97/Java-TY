package groom;

public class First_Sec_third_largenum {

	public static void main(String[] args) {
		
		int [] arr= {1,5,9,7,6};
		int fl=0; int sl=0; int tl=0;
		int sum=1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>fl)
			{
				tl=sl;
				sl=fl;
				fl=arr[i];			
			}
			else if(arr[i]>sl)
			{
				tl=sl;
				sl=arr[i];
			}
			else if(arr[i]>tl) {
				tl=arr[i];
			}
		}
		System.out.println(fl+" "+sl+" "+tl);
		sum=sum*fl*sl*tl;
		System.out.println(sum);
		
	}

}
