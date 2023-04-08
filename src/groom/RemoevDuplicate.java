package groom;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoevDuplicate {

	public static void main(String[] args) {
		//-------------------------------------------------------------- remove duplicate  -----------------------------//
		
		Set<Integer> set=new HashSet<>();
		int [] a= {2,4,4,6,5,6};
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		for(Integer s:set) {
			System.out.println(s);
		}
	//-------------------------------------------------------------- remove duplicate with count -----------------------------//
		
		System.out.println("------ remove duplicate with count ----");
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		for(int i=0; i<a.length; i++) {
			lh.add(a[i]);
		}
		
		for(Integer h:lh)//removes duplicate {2,4,5,6}
		{
			int m=0;
			for(int j=0; j<a.length; j++)
			{
				if(h==a[j]) {  
					m++;
					}
			}System.out.println(h+" "+m);		
			
System.out.println("-------------------------------------");			
			if(m>1) {
				System.out.println(h+" "+m);
				}
		}
	}
}
