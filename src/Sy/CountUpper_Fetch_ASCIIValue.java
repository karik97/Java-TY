package Sy;
public class CountUpper_Fetch_ASCIIValue {
	//input: dabDhgjB >> fetch the alphabet which are present in both uppercase and lowercase
	//output: DB >>print the higher ascii charcter presnt in the result 
	//output: D
	public static void main(String[] args) {
		
		String arr="dabDhgjB";
        String res = "";        
        
		for(int i=0; i<arr.length(); i++) {
			char ch = arr.charAt(i);
			if(ch>=65 && ch<=90) {
				res += ch;	
			}			
		}
		
		// Find highest ASCII character in result
		char hA=0;	
		for(int i=0; i<res.length(); i++) {
			char ch=res.charAt(i);
			if(ch>hA) {
				hA=ch;
			}
		}
		
		System.out.println(hA);
		
	}
}
