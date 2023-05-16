package Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9};

		String arr="";

		//remove duplicate element even though having multiple duplicate values

		for(int i=0; i<a.length; i++) {

			for(int j=i+1; j<a.length; j++) {

				if(a[i]==a[j] && arr.indexOf(Integer.toString(a[i]))==-1) {

					arr+=a[i]+" ";
				}				
			}		
		}
		System.out.println(arr);

		//print unique
		for(int i=0; i<a.length; i++) {
			int c=0;
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j] ) {

					c++;
				}				
			}
			if(c==1) {
				//System.out.print(a[i]+" ");
			}

		}

	}

}
