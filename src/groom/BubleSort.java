package groom;

public class BubleSort {

	public static void Asc() {
		
	    int sum=1;	
        int [] arr= {7,2,2,1,5};		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					//System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
				}
			}System.out.print(arr[i]+" ");
		}
		System.out.println("------>>Ascending order");
		
		for(int i=0; i<3; i++)
		{
			sum=sum*arr[i];
		}
		//System.out.println(sum);
		
		
		
	}
	
	public static void Des() {
		
	       int [] arr= {7,2,0,1,5};		
			for(int i=0; i<arr.length; i++)
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}System.out.print(arr[i]+" ");
			}System.out.println("------>>Descending order");
		}
	
	public static void main(String[] args) {
		
		BubleSort.Asc();
		//BubleSort.Des();
	}

}
