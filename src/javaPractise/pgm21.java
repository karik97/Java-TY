package javaPractise;

public class pgm21 {

	public static void main(String[] args) 
	{
		String value = "app applium application";
		String[] arr = value.split(" ");
		String ans = "";
		
		for (int i = 0; i < arr[0].length(); i++) 
		{
			Boolean flag = true;
			String ch = arr[0].substring(0, i+1);
			
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
		System.out.println(ans);

	}

}
