package javaPractise;

public class pgm16 {

	public static void main(String[] args) {
		// Numerical Pyramid
		
		int space = 4; int star = 1; int n=1; int max = 5;
		for(int i=1; i<=max; i++)
		{
			n=1;
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=star; k++)
			{
				System.out.print(n);
				if(k>(star/2)) 
					
				n--;
				else 
				n++;
			}
		
			System.out.println();
			star = star+2;
			space--;
		}

	}

}
