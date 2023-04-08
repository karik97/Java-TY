package Assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ocuurence_With_Collection {
//find the occurence of each digit using collection
	public static void main(String[] args) {
		
		int [] arr= {6,1,1,4,5,5,2};
		Map<Integer, Integer> m=new LinkedHashMap<>();
		for(int a:arr)
		{
			if(!m.containsKey(a)) {
				m.put(a, 1);
			}
			else {
				Integer c = m.get(a);
				m.put(a, c+1);
			}
		}
		for(Entry<Integer, Integer> o:m.entrySet()) {		
			System.out.println(o.getKey()+"---"+o.getValue());
		}

	}
}
