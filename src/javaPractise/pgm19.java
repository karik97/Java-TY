package javaPractise;

public class pgm19 {

	public static void main(String[] args) {
		// Rotate the Array
		
		int[] arr = {1,2,3,4,5};
		
		int v = 2; int v2 = v; int max = arr.length; int dmy = 0;
		for (int i = v; i < max; i++) {
			System.out.print(arr[i]);

			if (i + 1 == max) {
				if (dmy == 0) {
					i = -1;
					max = v2;
				}
				dmy++;
			}
		}
		
		
	}

}
