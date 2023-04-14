package SonyLogicalPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ForkJoinTask;

class dummy
{
	
	public static void main(String[] args) throws IOException 
	{				
		
		String value = "i love india";
		String value2 = value.replaceAll(" ", "");
		String rev = "";
		
		int j = value2.length()-1;
		
		for (int i = 0; i < value.length(); i++) 
		{
			if(value.charAt(i)==' ') 
			{ 
				rev = rev+" "; 
			}
			else
			{ 
				rev = rev+value2.charAt(j); 
				j--;
			}
		
			
		} 
		System.out.println(rev);
		
	}
	
	
	
}
 
