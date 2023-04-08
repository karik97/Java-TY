package groom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class linked_list {

	public static void main(String[] args) {
		
		HashSet h = new HashSet<>();
		h.add(123);		h.add("njn");		h.add("321654");
		h.add(456);		h.add("2jn");		h.add("oo");
		h.add(451);		h.add("nj1");		h.add(null);		h.add("hgh");		h.add("ghjhg");
		h.add("jhbgutfr6y");
		h.add(13);		h.add("n5n");
		h.add("njn");		h.add("nn");	
		System.out.println(h);
		
		
		 TreeSet ts = new TreeSet<>();
		 ts.add("jnhb");
		 ts.add("jnuhygt");
		 System.out.println(ts);
		 
		 Hashtable ht = new Hashtable<>();
		 ht.put("keu", 1);
		 ht.put("raksh", "lowda");
		 System.out.println(ht);
		
		 HashMap<Object ,Object> hm = new HashMap<>();
		hm.put("x","156");
		 hm.put(null, null); hm.put(null, "mk"); hm.put(",clo", null);
		
		 for(Entry<Object, Object> a: hm.entrySet()) {
			// System.out.println(a.getKey()+"-"+a.getValue());
		 }
			 
		 LinkedHashMap<Object,Object> lm = new LinkedHashMap<>();
		 lm.put("mkcdm", 123); lm.put(null, null); lm.put(123, null);lm.put(123, "jk"); lm.put(456, ht);
		 System.out.println(lm);
		 
		 
		 TreeMap tm = new TreeMap<>();
		 tm.put(456,null);tm.put("hbn", 123);
		 tm.put(123,null);
		 System.out.println(tm);
		 
		 
		 
	}

}
