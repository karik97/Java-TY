package Sony;

//I/p : aabbaa
//O/p : aa ab bb ba aa
public class Alphabets {

	public static void main(String[] args) {
		
		String arr="aabbaa";
		String [] seq=new String[arr.length()];
		
		for(int i=0; i<arr.length(); i++) {
			
			char c = arr.charAt(i);
			if(i<arr.length()/2) {
				seq[i]=String.valueOf(c)+String.valueOf(c);
			}
			else {
				seq[i]=String.valueOf(arr.charAt(arr.length()-1  -i))+String.valueOf(c);
			}
		}
		
		for(String s:seq) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		
         String palindrome = "aabbaa";
         String[] sequence = new String[palindrome.length()];

         // Convert palindrome to sequence
         for (int i = 0; i < palindrome.length(); i++) {
             char c = palindrome.charAt(i);
             if (i < palindrome.length() / 2) {
                 sequence[i] = String.valueOf(c) + String.valueOf(c);
             } else {
                 sequence[i] = String.valueOf(palindrome.charAt(palindrome.length() - 1 - i)) + String.valueOf(c);
             }
         }

         // Print sequence
         for (String str : sequence) {
             System.out.print(str + " ");
         }
	}

}
