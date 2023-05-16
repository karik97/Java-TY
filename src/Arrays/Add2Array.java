package Arrays;

public class Add2Array {

	public static void main(String[] args) {
		
		int a[]= {1,2,8,6,55,87};
		int b[]= {1,2,8,9};
		
				
		int l=a.length;
		if(b.length>a.length) {
			l=b.length;
		}
		
        for(int i=0; i<l; i++) {
        	try {
        		System.out.println(a[i]+b[i]);
        	}catch (Exception e) {
				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}
        }
	}

}
