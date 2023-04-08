package Strings;

public class SumofdigitinString {

	public static void main(String[] args) {
		
		String s="a2b4f6";//12
		int sum=0; 
		for(int i=0;i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>=48 && ch<=57) {
				sum=sum+ch-48;
				//System.out.println(0+ch-48);
			}
		}//System.out.println(sum);
		
		
		String k="a12b13v5";//30
		int sum1=0;
		int tsum=0;
		
		for(int j=0; j<k.length(); j++) {
			char cha = k.charAt(j);
			if(cha>=48 && cha<=57) {
				tsum=tsum*10+cha-48;
			}else {
				sum1=sum1+tsum;
				tsum=0;
			}
		}
		System.out.println(sum1+tsum);
	}

}
