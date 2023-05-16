package Arrays;

public class Duplicate {

	public static void main(String[] args) {
		
		int arr[] = {1,2,5,6,5,6,4,5,5,4,5,6};
        int start=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				arr[start]=arr[i];
				start++;
			}
		}
		arr[start]=arr[arr.length-1];
		for(int i=0; i<start+1; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		for(int i=0; i<arr.length; i++) {
			int c=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c==2) {
				//System.out.print(arr[i]+" ");
			}
		}
	}	
}
