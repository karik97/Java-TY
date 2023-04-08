package groom;

public class FindMissingNum {

	public static void main(String[] args) {
		
		//array should not have duplicates
		//values should be in proper range
		//array no need to be sorted
		
		int []a= {0,1,5,6,2,4};
		int n=a.length+1;
		
		int s=(n*(n+1))/2;
		
		for(int i=0; i<a.length; i++) {
			s=s-a[i];
		}
		System.out.println(s);
	}

}
