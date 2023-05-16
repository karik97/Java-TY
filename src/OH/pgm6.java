package OH;

import java.util.HashMap;
import java.util.Iterator; 
import java.util.Map.Entry;

public class pgm6 {

	public static void main(String[] args) 
	{
	String value = "this is test yantra test";
	String[] s;
	String[] splitted=s = value.split(" ");
	
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	for (int i = 0; i < splitted.length; i++) {
		if (!map.containsKey(splitted[i])) {
			map.put(splitted[i], 1);
		} else {
			int count = map.get(splitted[i]);
			map.put(splitted[i], count + 1);
		}
	}
	for (Entry<String, Integer> ans : map.entrySet()) {
		if (ans.getValue() > 1) {
			System.out.println(ans.getKey());
		}
	}
	
	for (int i = 0; i < s.length; i++) 
	{
		int c=0;
		for (int j = 0; j < s.length; j++) 
		{
			if(s[i].equals(s[j]))
			{
				if(i>j)
				{
					break;
				}
				c++;
			}
		}
		if(c>1)
		{
			System.out.println(s[i]);
		}
	}
	}

}
