package Strings;

public class SugregateString {

	public static void main(String[] args) {
		
		String a="a2b&d3e";
		String cl=""; String sl=""; String num="";  String sc="";
	
		for(int i=0; i<a.length(); i++) {
			    char ch = a.charAt(i);
			    if(ch>=48 && ch<=57) {
			        num=ch+num;
			    }
			    else if(ch>=65 && ch<=90) {
			    	cl=cl+ch;
			    }
			    else if(ch>=97 && ch<=122) {
			    	sl=sl+ch;
			    }
			    else {
			    	sc=ch+sc;
			    }
		}System.out.print(cl+" "+sl+" "+sc);System.out.print(" "+num);
	}

}
