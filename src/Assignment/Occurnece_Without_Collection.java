package Assignment;
//find the occurence of each digit without using collection
public class Occurnece_Without_Collection {

	public static void main(String[] args) {
		
		char[] arr = "aabbcettrrraaee".toCharArray();
        for(int i=0; i<arr.length; i++)
        {  	
        	int c=1;
        	for(int j=i+1; j<arr.length; j++)
        	{
        		if(arr[i]==arr[j]) {
        			c++;
        		}
        		else {
                    break;}
        	}
        	System.out.print(arr[i]+""+c);		
    		i+=c-1;
        	
        }
        
        
	}

}
