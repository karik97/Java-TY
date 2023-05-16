package String;

public class demo {

	public static void main(String  [] args) {

		for(int i=1; i<=40; i++) {
			int no=i;
			int c=0;
			
			for(int j=1; j<=no; j++ ) {
				
				if(no%j==0) {
					c++;
				}
				
			}
			
			if(c==2 ) {
				System.out.println(no);
			}
		}
	/**
	 * 2
3
5
7
11
13
17
19
23
29
31
37
	
	 */
		
	}
}



