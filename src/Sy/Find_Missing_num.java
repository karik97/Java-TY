package Sy;

public class Find_Missing_num {
//	I/p : int i ={2,3,7}
//	O/p : 1 4 5 6 8 9 10

	public static void main(String[] args) {
		
		int [] arr ={5,8,3,6};
		
		for(int i=1; i<=10; i++) {
			int c=1;
			for(int j=0; j<arr.length; j++) {
				
				if(i==arr[j]) {
					c++;
					break;
				}
			}
			if(c==1) {
				System.out.println(i);
			}
		}

	}

}
