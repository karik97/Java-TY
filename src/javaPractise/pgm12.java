 package javaPractise;


import java.util.HashMap;
import java.util.Map.Entry;

public class pgm12 {

	public static void main(String[] args) {
		// Reverse the String with HashMap
		
		String value = "today start with java";
		String[] arr = value.split(" ");
		int v = arr.length-1;
		
		HashMap<String, Integer> ref = new HashMap<String, Integer>();
		
		for (int i = 0; i < arr.length; i++) 
		{
			ref.put(arr[i], i);
		}
		
		//System.out.println(ref);
		for(int i=0; i<arr.length; i++)
		{
			for (Entry<String, Integer> entry : ref.entrySet()) 
			{
				if(entry.getValue()==v)
				{
					System.out.println(entry.getKey());
					v--;
				}
			}
		}

	}

}
