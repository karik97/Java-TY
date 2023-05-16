package OH;

public class pgm1 {

	public static void main(String[] args) 
	{
		String value = "aaabbccdab";//a3b2c2d1a1b1
		char[] ch = value.toCharArray();



		String ans = value.charAt(0)+""; 

		for (int i = 0; i < value.length()-1; i++)
		{
			if(value.charAt(i)==value.charAt(i+1)) 
			{ 
				ans = ans+value.charAt(i+1); 
			}
			else
			{
				ans = ans+" "+value.charAt(i+1); 
			} 
		}

		//System.out.println(ans);

		String[] finalvalue = ans.split(" "); for (int i = 0; i < finalvalue.length;
				i++) {
			System.out.println(finalvalue[i].charAt(0)+"----->"+finalvalue[i].length());
		}



		/*
		 * for (int i = 0; i < ch.length; i++) { int count=1 ; for (int j = i+1; j
		 * <ch.length; j++) { if(ch[i]==ch[j]) { count++; i++; } else { break; }
		 * 
		 * } System.out.println(ch[i]+"---->"+count);
		 * 
		 * }
		 */


	}

}
