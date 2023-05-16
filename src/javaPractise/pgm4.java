package javaPractise;

import java.util.ArrayList;
import java.util.TreeSet;

public class pgm4 {

	public static void main(String[] args) {
		// Find All Possible Substring
		String value = "aabbbaccds";
		ArrayList<Object> arr = new ArrayList<>();
		for (int i = 0; i < value.length()-1; i++) 
		{
			//System.out.println(value.substring(i,i+2));
			arr.add(value.substring(i,i+2));
		}
			System.out.print("Substring Array --->"+arr);
		
		// Removing Duplicates from the Given Array
		TreeSet<Object> arr1 = new TreeSet<>(arr);
		//System.out.println("Substring Array Without Duplicates --->"+arr1);
		
		//other way
		for(int i=0; i<value.length()-1; i++) {
			System.out.print(value.substring(i, i+2)+" ");
		}
	}

}
