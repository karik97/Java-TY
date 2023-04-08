package groom;

public class Append0sAtFirst {

	public static void main(String[] args) {
		
		int [] arr= {0,1,0,1,1,0};
		int [] b=new int[arr.length];
		int m=0; 
		int n=arr.length-1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
			{
				b[m]=arr[i];
				m++;
			}
			else
			{
				b[n]=arr[i];
				n--;
			}
		}
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(b[j]+" ");
		}
		
		int [] arr1= {0,1,0,0,1};
		int [] b1=new int[arr1.length];
		int m1=0; 
		int n1=arr1.length-1;
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]!=0)
			{
				b1[m1]=arr1[i];
				m1++;
			}
			else
			{
				b1[n1]=arr1[i];
				n1--;
			}
		}
		for(int j=0; j<arr1.length; j++)
		{
			System.out.println(b1[j]+" ");
		}
	
	}

}
