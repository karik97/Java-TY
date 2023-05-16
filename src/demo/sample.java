package demo;

public class sample {

	public static void main(String[] args) {

		char [] s="aabbccaagghha".toCharArray();


		for(int i=0; i<s.length; i++) {
			int c=1;
			
			int j=i+1;;

			if(s[j]==s[i]) 
			{
				c++;
				j++;
			}
			else 
			{
				if(j==s.length-1)
					break;
				break;				
			}
			System.out.print(s[i]+""+c);
			i+=c-1;
			
			
		}

	}

}
