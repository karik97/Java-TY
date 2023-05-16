package Arrays;

public class Firs_3_Min {

	public static void main(String[] args) {
		
		int a[]= {3,5,6,9};
		int fm=a[0]; int sm=a[0]; int tm=a[0];

		for(int i=0; i<a.length; i++) {
			if(a[i]<fm) {
				tm=sm;
				sm=fm;
				fm=a[i];
			}
			else if(a[i]<sm || sm==fm) {
				tm=sm;
				sm=a[i];
			}
			else if(a[i]<tm || sm==tm ) {
				tm=a[i];
			}
		}
		System.out.println(fm+" "+sm+" "+tm);
	}

}
