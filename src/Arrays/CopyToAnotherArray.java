package Arrays;

import java.util.Scanner;

public class CopyToAnotherArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int[sc.nextInt()];
		System.out.println("enter the values");
        
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		
	}

}
