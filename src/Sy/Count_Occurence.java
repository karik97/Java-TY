package Sy;
//Count Occurance of string = "aabbcettrrraaee"  , O/p - a2b2c1e1t2r3a2e2

public class Count_Occurence {

	public static void main(String[] args) {

		//aabbcettrrraee

		char[] arr = "https".toCharArray();
		//int[]arr= {1,3,5,6,1,1,7}; remove duplicate from array if duplicates are sequential position
		for(int i=0; i<arr.length; i++)
		{  	
			int c=1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j]) {
					c++;
				}
				else {  break;   }
			}
			System.out.print(" "+arr[i]+""+c+" "); 
			i+=c-1;          	
		} 

		//print string occurence with single loop
		int count = 1;

		for(int i=0; i<arr.length; i++)
		{  
			try {
				if(arr[i]==arr[i+1]) 
				{
					count++;
				}
				else 
				{
					System.out.print(arr[i]+""+count);
					count = 1;
				}   
			}
			catch(Exception e) {
				System.out.print(arr[i]+""+count);
			}
		} 


		char [] s="aabbccaagghha".toCharArray();

		for(int i=0; i<s.length; i++) {
			int c=0;
			char a=s[i];
			for(int j=0; j<s.length; j++) {
				char b=s[j];

				if(a==b && i>j)
				{
					break;
				}
				else if(a==b) {
					c++;
				}       			
			}
			if(c>0)
				System.out.print(a+""+c);

		}
	}
}
