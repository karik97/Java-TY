package collection;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<Object> a=new ArrayList<>();
		
		a.add("vvva");
		a.add('s');
		System.out.println(a);
		ArrayList<Object> b=new ArrayList<>();
		b.add(12.5);
		b.add(65);
		System.out.println(b);
	    //b.add(a);
	    System.out.println(b);//here collection a will be taken as a single object it will print b collection inside a
		b.addAll(a);
		System.out.println(b);
		
		
		
	}

}
