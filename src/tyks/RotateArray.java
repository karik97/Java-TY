package tyks;

import java.util.Arrays;

import collection.arraylist;

public class RotateArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		
		for(int i=0; i<2; i++) {
			int ch=a[0];
			for(int j=1; j<a.length; j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=ch;
		}
		System.out.println(Arrays.toString(a));
	}

}
