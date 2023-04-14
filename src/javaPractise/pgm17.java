package javaPractise;

public class pgm17 {

	public static void main(String[] args) {
		// Find the sequence matching char in the given array
		
		String value = "apple appium application";
		String[] arr = value.split(" "); 
		boolean flag =true;
		
		for(int i=0; i<arr[0].length(); i ++)
		{
			String ss1 = arr[0].substring(0, i+1);
			for(int j=1; j<arr.length; j++)
			{
				if(!arr[j].startsWith(ss1))
				{
					System.out.println(arr[0].substring(0, i));
					flag=false;
					break;
				}
			}
			
			if(flag==false)
			break;
		}
		

	}

}
