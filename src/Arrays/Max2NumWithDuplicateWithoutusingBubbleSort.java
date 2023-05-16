package Arrays;

public class Max2NumWithDuplicateWithoutusingBubbleSort {

	public static void main(String[] args) {
		
		int a[]= {2,3,65,65,6,58};
		int fm=a[0];
		int sm=a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>=fm) {
				if(a[i]!=fm) {
					sm=fm;
				}
				fm=a[i];
			}
			else if(a[i]<a[i]||fm==sm) {
				sm=a[i];
			}
		}//System.out.println(fm+" "+sm);

		
		int f=0; int s=0;
		for(int i=0; i<a.length; i++) {
			if(f<a[i]) {
				s=f;
				f=a[i];				
			}
			else if(sm<a[i]) {
				s=a[i];
			}			
		}
		System.out.println(f+" "+s);
		
		
	}

}
