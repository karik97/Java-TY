package groom;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class print_without_duplicate {

	public static void main(String[] args) {
		
		int [] arr= {2,4,4,6,5,6};
		ArrayList<Integer>lh = new ArrayList<>();
		for( int i=0; i<arr.length; i++) {
		    lh.add(arr[i]);
		}
		int c=0;
		for(Integer l:lh) {
			for(int i=0; i<arr.length; i++)
			{
				if(l==arr[i])
				{
					c++;
					System.out.println(c);
				}
			}		
		}
	}

}
