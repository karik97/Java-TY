package javaPractise;

public class pgm18 {

	public static void main(String[] args) {
		// String Occurrence
		
		String value = "aaabbcccaadggf"; 
		//char[] arr = value.toCharArray();
		
		/*
		 * for (int i = 0; i < arr.length; i++) { int count = 1; for (int j = i+1; j <
		 * arr.length; j++) { if(arr[i]==arr[j]) { count++; i=j; } else { break; } }
		 * System.out.println(arr[i]+""+count); }
		 */

		for (int i = 0; i < value.length(); i++) 
		{
			int count = 1;
			for (int j = i+1; j < value.length(); j++) 
			{
				if(value.charAt(i)==value.charAt(j))
				{
					count++;
					i=j;
				}
				else
				{
					break;
				}
			}
			System.out.println(value.charAt(i)+""+count);
		}
	}

}
