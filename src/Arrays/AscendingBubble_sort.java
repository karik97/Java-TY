package Arrays;

public class AscendingBubble_sort {

	public static void main(String[] args) {
		
		int a[]= {2,4,8,9,5,1,3,6};
		
		for(int i=0; i<a.length; i++ ) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {//if we need descending order replace operator with < 
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int j=0; j<a.length; j++)System.out.println(a[j]);

	}

}
