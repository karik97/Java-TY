package Strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String [] arr= {"abyy","bbgc","cchhgd"};

		for(int i=0; i<arr.length; i++) {

			String v = arr[i];

			for(int j=0; j<v.length(); j++) {

				try	{			
					if(v.charAt(j)==v.charAt(j+1)) {

					}
					else {
						System.out.print(v.charAt(j));						
					}
				}
				catch(Exception e) {
					
					System.out.print(v.charAt(j));
				}
			}
			System.out.println();
		}				
	}

}
