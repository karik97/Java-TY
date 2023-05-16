package PRKQues;

public class FirstMax {

	public static void main(String[] args) {
		
		int [] arr= {7,-3,0,2,1,-9};
		
	//	int f=0; int s=0;
		
		int f=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>f) {
				f=arr[i];
			}		
		}
		System.out.println(f);

	}

}
