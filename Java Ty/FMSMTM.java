package JavaTY;

public class FMSMTM {

	public static void main(String[] args) 
	{
		int[]arr= {6,18,9,4,36,3};

		int fm=arr[0];  int sm=arr[0];  int tm=arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<fm)
			{
				if(arr[i]!=fm)
				{
					sm=fm;

				}
				fm=arr[i];

			}
			else if(fm==sm  || arr[i]<sm)
			{
				sm=arr[i];     //18
			}

		}

		System.out.println(fm);
		System.out.println(sm);
		System.out.println(tm);





	}

}
