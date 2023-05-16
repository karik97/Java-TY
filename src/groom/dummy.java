package groom;

public class dummy {

	public static void main(String[] args) {

		String[] v = "kartik".split("");
		
		for(int i=0; i<v.length; i++) {
			int ac=1;
			for(int j=i+1; j<v.length; j++) {
				if(v[i].equals(v[j])) {
					ac++;
				}
			}
			if(ac>=1) 
			{
				int c=0; int no=ac;

			for(int k=1; k<=2; k++)
			{
				if(no%k==0)
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.println(v[i]);
			}
			}

		}


	}

}
