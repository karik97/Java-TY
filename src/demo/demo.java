package demo;
public  class demo{
	
	public static void main(String[] args) {
		
		int []a = {1,5,6,9,7,8};
		
		int [] b= {1,5,6,3};
		
		int l=a.length;
		
		if(b.length>a.length) {
			l=b.length;
		}
		
		for(int i=0; i<l; i++) {
			try {
				System.out.print(a[i]+" "+b[i]+" ");
				
			}
			catch(Exception c) {
				if(b.length>a.length) {
					System.out.print(" "+b[i]);
				}
				else {
					System.out.print(" "+a[i]);
				}
			}
		}
		
	}
}
