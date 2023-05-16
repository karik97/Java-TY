package tyks;

public class printAlternativeNumber {

	public static void main(String[] args) {

		// 1-40 
		int start=1; 
		
		for(;start<=40; start++) {
			int no=start;
			int c=0;
			
			for(int j=1; j<=no; j++) {
				if(no%j==0) {
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(no);	
			}
		}
	}

}
