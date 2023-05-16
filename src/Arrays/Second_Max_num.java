package Arrays;

public class Second_Max_num {

	public static void main(String[] args) {
		
		int a[]= {1,5,3,9,7,5};
       int f=a[0]; int s=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>f) {
				s=f;
				f=a[i];
			}
			else if(a[i]>s) {
				s=a[i];
			}
		}System.out.print(f+" "+s);
		
	}

}
