package Arrays;

public class RotateAnArrayByPasssingKey {

	public static void main(String[] args) {
		
		int a[]= {2,3,5,4,0};
		
		int k=3;
		for(int i=0; i<4; i++) {
			int t=a[0];
			for(int j=1; j<a.length; j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=t;
		}
          
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=0; i<k; i++) {
			int t=a[a.length-1];
			for(int j=0; j<a.length-1; j++) {
				a[j+1]=a[j];
			}
			a[0]=t;
		}
          
		for(int i=0; i<a.length; i++) {
			//System.out.println(a[i]);
		}
		
		
	}

}
