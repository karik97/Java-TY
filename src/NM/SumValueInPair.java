package NM;

import java.util.HashMap;

public class SumValueInPair {

	public static void main(String[] args) {
		int [] arr= {1,5,9,6,5,8,9,9,5,6};

		int sum=10;

		String res="";

		HashMap<Integer, Integer> m=new HashMap<>();

		for(int i=0; i<arr.length; i++) {

			int v = sum-arr[i];

			if(m.containsKey(v)) {

				Integer valueindex = m.get(v);
				

				if(res.indexOf(Integer.toString(arr[i]))==-1 || res.indexOf(Integer.toString(arr[valueindex]))==-1)
				{
					res+=arr[i]+","+arr[valueindex]+" ";					
				}

			}

			m.put(arr[i],i);
		}
		System.out.println(res);


	}

}
