package Arrays;

public class MaxNum {

	public static void main(String[] args) {
		
		int a[]= {2,5,6,7,89,9};
        int m=a[0];
        
        for(int i=0; i<a.length; i++) {
        	if(a[i]>m) {
        		m=a[i];
        	}
        }System.out.println(m);
	}

}
