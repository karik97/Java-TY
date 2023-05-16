package javaPractise;

public class pgm9 {

	public static void main(String[] args) {
		// Find the Fibonnaci Number which divisible by 3 and 5 from 1 - 50

		int fib1 = 0;
		int fib2 = 1;
		int fib3 = fib1+fib2;
		System.out.println(fib1);
		System.out.println(fib2);
		for(; fib3<=50  ; )
		{
			//System.out.println(fib3);

			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1+fib2;

			if(fib3%3==0 && fib3%5==0)
			{
				System.out.println(fib3);
				//break;	
			}
		}
	}

}
