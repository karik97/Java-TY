package JavaTY;

public class Append0sAtFirst {

	public static void main(String[] args) 
	{
         int []a= {0,1,0,0,1};//o/p 0 0 0 1 1
         
         int[] b=new int[a.length];//5
         int m=0;
         int n=a.length-1;//4
         for(int i=0;i<a.length;i++)
         {
        	 if(a[i]==0)
        	 {
        		 b[m]=a[i];
        		 m++;       //b[m]object ++ it wil go to next array box 
        	 }
        	 else
        	 {
        		 b[n]=a[i];
        		 n--;        //from last array box it will reduce and come
        	 }
        	 
         }
         for(int i=0;i<b.length;i++)
         {
        	 
        	 System.out.print(b[i]+" ");
         }
         
         
	}

}
