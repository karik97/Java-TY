package Pattern;

public class Character_pattern {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>=j) {
					System.out.print((char)('a'+j));
				}
			}System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>=j) {
					System.out.print((char)('a'+i));
				}
			}System.out.println();
		}
		
		char ch='a';
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>=j) {
		       	System.out.print(ch++);
				}
			}System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>=j) {
		      	System.out.print((char)('a'+i+j));
				}
			}System.out.println();
		}
		
	}
}
