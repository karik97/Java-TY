package Strings;

import java.util.Scanner;

public class CountNoofUpperandLowerCase {

	public static void main(String[] args) {
		
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter input");
			String k="mjKJnJNJnnnNJnNnJN";
			int u=0;  int l=0;
			for(int i=0; i<k.length(); i++)
			{
				char ch = k.charAt(i);
				if(ch>=65 && ch<=90)
				{
					u++;
				}
				else if(ch>=97 && ch<=122)
				{
					l++;
				}
			}
			System.out.println("no of uppercase "+u);
			System.out.println("no of lowercase "+l);
			
		}

	}

}
