package PRKQues;

import java.util.ArrayList;

import collection.arraylist;

public class InsertMiddlleOfArray {

	public static void main(String[] args) {
		
		int s[]= {1,5,9,7,45,6};
		ArrayList<Integer> arlis = new ArrayList<Integer>();
		for(int i=0; i<s.length; i++) {
			if(s.length/2==i) {
				arlis.add(55);
			}
			else {
				arlis.add(s[i]);
			}
		}System.out.println(arlis);
		
	}

}
