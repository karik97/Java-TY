package Sony;
//Count Occurance of string = "aabbcettrrraaee"  , O/p - a2b2c1e1t2r3a2e2

public class Count_Occurence {

	public static void main(String[] args) {
		
		char[] arr = "aabbcettrrraee".toCharArray();
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
        	System.out.print(arr[i]+""+c);  		
    		i+=c-1;  
        	
        } 
	}
}
