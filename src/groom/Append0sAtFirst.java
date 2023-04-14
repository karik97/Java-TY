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
			//System.out.println(b[j]+" ");
		}
		
		
		for(int i=0; i<arr.length; i++) {
			int temp=arr[0];
			for(int j=0; j<1; j++) {
				try {
					arr[j]=arr[j+1];
				}
				catch (Exception e) {}					
			}
			arr[arr.length-1]=temp;					
		}
		
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		
	}

}
