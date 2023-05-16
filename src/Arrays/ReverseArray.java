package Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,5,9,7,4};

		int start=0;
		int end=a.length-1;
		for(int i=0; i<a.length; i++) {
			if(start<end) {
				int t=a[start];
				a[start]=a[end];
				a[end]=t;
				start++;
				end--;
			}
		}System.out.println(Arrays.toString(a));

		for(int j=0; j<a.length; j++) {
			//System.out.println(a[j]);
		}
		
		
		
		
		
		
	}

}
