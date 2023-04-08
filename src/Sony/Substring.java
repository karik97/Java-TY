package Sony;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Substring {
/**
  input: "aabbbaccds"
           get all possible substring of length 2
         and also try using collection
         remove duplicates 
  
 */
	public static void main(String[] args) {

		String s = "aabbbaccds";
		
         Set<String> set = new LinkedHashSet<String>();
        
        for (int i=0; i<s.length()-1; i++) {
           
            set.add(s.substring(i, i + 2));
                       
        }
 
        System.out.println(set);
        
	}

}
