package String;

public class Fetch_OTP {

	public static void main(String[] args) {

		String k="##$$$^@*^@bhbhbk&^T^&hjbjhbjgvg5r65kjnkjk2545";
		String res="";
		int c=0;
		for(int i=0; i<k.length(); i++) {	
			char ch = k.charAt(i);

			if(ch>=48 && ch<=57) {
				c++;
				res+=ch;

				if(c==4) 
					break;
			}
			else {
				c=0;
				res="";
			}
		}
		System.out.println(res);		  
	}

}
