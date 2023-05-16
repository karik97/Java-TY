package String;

public class SumOfString {

	public static void main(String[] args) {
		
		
		String s="a11b22c33";
		int sum=0;
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			if(ch>=48 && ch<=57) {
//				int n=ch-48;
//				sum+=n;
//			}
//		}//System.out.println(sum);

		
		int ls=0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>=48 && ch<=57) {
				
				sum=sum*10+ch-48;
			}
			else {
				ls=ls+sum;
				sum=0;
			}
		}System.out.println(ls+sum);
		
		
	}

}
