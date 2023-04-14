package javaPractise;

public class pgm10 {

	public static void main(String[] args) {
		// Find the Armstorng Number
		int no = 1634;
		int temp = no; int temp2 = no;
		int givenNoCount = 0;
		int sum = 0;
		
		//Find the Count of the Given Number
		while(no!=0)
		{
			no = no/10;
			givenNoCount++;
		}
		//System.out.println(givenNoCount);
		
		// Sum the Number
		while(temp!=0)
		{
			int rem = temp%10;
			sum += Math.pow(rem, givenNoCount);
			temp = temp/10;
		}
		
		// Assertion
		if(temp2==sum)
		{
			System.out.println("Armstrong");
		}

	}

}
