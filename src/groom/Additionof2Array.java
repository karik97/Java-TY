package groom;

public class Additionof2Array {

	public static void main(String[] args) {
		
		int a[]= {2,4,5,2};
		int b[]= {3,2};
		int l=a.length;
		if(b.length>a.length)
		{
			l=b.length;
		}
		
		for(int i=0; i<l; i++)
		{
			try {
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e) {
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.println(b[i]);
				}
			}
		}
	}

}
