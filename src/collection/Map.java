package collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		
		String k="kartik";
		
		LinkedHashMap<Character, Integer> m=new LinkedHashMap<>();
		
		for(int i=0; i<k.length(); i++) {
			if(!m.containsKey(k)) {
				m.put(k.charAt(i), 1);
			}
			else
			{
				m.put(k.charAt(i), m.get(k.charAt(i))+1);
			}
		}
		
		for(Character kv:m.keySet()) {
			//System.out.println(kv);
		}
		
		//other way to print using entryset
		
		for(Entry<Character, Integer> kv:m.entrySet()) {
			System.out.println(kv.getKey()+" "+kv.getValue());
		}
		
	}

}
