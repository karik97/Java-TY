package Strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
for(;;) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		String k = sc.next();
        String rev="";
		for(int i=k.length()-1; i>=0; i--) {
			rev=rev+k.charAt(i);
		}
		if (rev.equals(k)) System.out.println(rev+" its a palindrome");
		else System.out.println(rev+" its not a palindorme");
	}}

}
