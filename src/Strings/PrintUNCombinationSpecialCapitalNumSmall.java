package Strings;

public class PrintUNCombinationSpecialCapitalNumSmall {

	public static void main(String[] args) {

		char special=33;  
		char capital=65;
		char small=97;
//		for(int j=0; j<10; j++) {
//
//			System.out.print(j+""+special++);
//
//			for(int i=0; i<8; i++) { 
//
//				if(i==0) {
//
//					System.out.print((char)capital++);
//
//				}
//
//				else {
//					if(small==122) {
//						small=97;
//					}
//					System.out.print((char)small++);
//				}
//
//			}
//			System.out.println();
//		}

		//single loop 

		char num=48;
		int count=0;
		for(int i=0; i<8; i++) {

			if(i==0) {

				System.out.print(capital++ +""+ num++ +""+ special++);

			}
			else {

				if(small==122) {
					small=97;
				}

				System.out.print(small++);

				if(i==7) {

					i=-1;
					count++;
					System.out.println();

					if(count==10) {
						break;
					}

				}
			}			
		}


	}

}
