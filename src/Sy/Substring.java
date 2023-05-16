package Sy;
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

		//System.out.println(set);

		String s1 = "cat catelog catter";//app application appium
		String[] arr = s1.split(" ");
		String ans = "";
		int k = arr[0].length()-1;

		for (int i = 0; i < k; i++) 
		{
			Boolean flag = true;
			String ch = arr[0].substring(0, i+2);

			for (int j = 1; j < arr.length; j++) 
			{
				if(arr[j].startsWith(ch))
				{
					if(j+1 == arr.length)
					{
						ans = ch;
					}

				}
				else
				{
					flag = false;
				}

			}
			if(flag==false)
				break;
		}
		//System.out.println(ans);


		String s11 []= "catelog cat catter".split(" ");

		String ch=s11[0]; boolean f=true;

		for(int i=0; i<ch.length(); i++) {

			String k1 = ch.substring(0,i+1);

			for(int j=1; j<s11.length; j++) {
				if(!s11[j].startsWith(k1)) {
					if(i==3) {
						//System.out.println(ch.substring(1,i));
						f=false;
						break;
					}
				}
				if(f==false)break;
			}

		}





		String v1="aabbaa";
		for(int i=0; i<v1.length()-1; i++) {
			//System.out.print(v.substring(i, i+2)+" ");
		}

	}

}
