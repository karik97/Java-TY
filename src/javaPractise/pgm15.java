package javaPractise;

public class pgm15 {

	public static void main(String[] args) {
		// Pyramid Program
		
		int maxLine = 4; int space = 3; int star = 1;
		
		for(int i=1; i<=4*2-1; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i>=maxLine)
			{
				star--;
				space++;
			}
			else
			{
				space--;
				star++;
			}
		}

	}

}
