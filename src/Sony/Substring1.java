package Sony;

public class Substring1 {

	public static void main(String[] args) {
		
		String s="apple appium application";
		String[] arr = s.split(" ");
		boolean flag=true;
		for(int i=0; i<arr[0].length(); i++) {
			String k = arr[0].substring(0, i+1);
			for(int j=1; j<arr.length; j++) {
				if(!arr[j].startsWith(k)) {
					//System.out.println(arr[0].substring(0,i));
					flag=false;
					break;
				}
			}
			if(flag==false)break;		
		}

		String v="aabbaa";
		for(int i=0; i<v.length()-1; i++) {
			System.out.println(v.substring(i, i+2));
		}
		
	}

}
