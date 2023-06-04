package javaPractise;

import java.util.HashMap;
import java.util.Map.Entry;

public class pgm6 {

	public static void main(String[] args) {
		// Take the Pair check the sum is 15 then print the Pair
		int[] arr = {-5,6,0,20,10,8,7};
		
		// With Loop
		for(int i=0; i<arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]+arr[j]==15)
				{
					//System.out.print(arr[i]+" "+arr[j]+" ");
				}
			}
		}
		// With HashMap
		
		HashMap<Integer, Integer> ref = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]+arr[j]==15)
				{
					ref.put(arr[i], arr[j]);
				}
			}
		}
		System.out.println(ref);
	}

}
