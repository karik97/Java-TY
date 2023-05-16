package Arrays;

public class Missing_NumFrmArray {

	public static void main(String[] args) {
		
		int a[]= {1,5,9,8,2};

		for(int i=0; i<=10; i++) {
			//int c=1;
			for(int j=0; j<a.length; j++) {
				if(i!=a[j]) {
					//c++;
					System.out.print(i+" ");
					break;
				}
			}
//			if(c==1) {
//				System.out.println(i);
//			}
		}
	}

}
