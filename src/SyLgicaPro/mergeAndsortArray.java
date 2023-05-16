package SyLgicaPro;

public class mergeAndsortArray {

	public static void main(String[] args)
	{
		int a1[]= {1,2,3,4,5};
		int a2[]= {2,4,6,8};
		int[] a3 = new int[a1.length+a2.length];
		int v = 0;
		for (int i = 0; i < a3.length; i++) 
		{ 
			
			if(i+1 > a1.length) 
			{	

				for (int j = v; j < v+1; j++) 
				{
					
					a3[i]=a2[j];
					
				}
				v = v+1;
			} 
			else
			{
				a3[i]=a1[i]; 
			}
			
		}
		
		for (int k = 0; k < a3.length; k++) 
		{
			for (int i = k+1; i < a3.length; i++) 
			{
				if(a3[k]>a3[i])
				{
					int temp = a3[k];
					a3[k] = a3[i];
					a3[i] = temp;
				}
			}
		}
		for (int i = 0; i < a3.length; i++) 
		{
			System.out.println(a3[i]);
		}
	}
}
