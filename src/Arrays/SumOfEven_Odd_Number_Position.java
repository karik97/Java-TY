package Arrays;

import java.util.Scanner;

public class SumOfEven_Odd_Number_Position {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
	          int l = sc.nextInt();
		int []a=new int[l];

		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int es=0;;
		int os=0;
		for(int j=0; j<a.length; j++) {
			if(j%2==0) {
				es+=a[j];
			}else {
				os+=a[j];
			}
		}
		
		System.out.println("the sum of even number position"+es);
		System.out.println("the sum of odd number position"+os);
	}

}
