package JavaTY;

public class MulOfFirstThreeMinNum {

	public static void main(String[] args) 
	{
		int[]arr= {4,8,5,1,3};
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			   
        			int temp = arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;   			
        			
        		}
        		
        	}
        }
		int mul=1;
		for(int i=0;i<3;i++)
		{
			mul=mul*arr[i];
			
		}
		System.out.println("The mul of first three min num is " +mul);
	}

}
