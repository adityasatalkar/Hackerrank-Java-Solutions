import java.util.Scanner;

public class IceCreamParlor 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
	    int t = in.nextInt();

        for(int k=0 ; k<t ; k++)
	    {
        	int m = in.nextInt();
        	int n = in.nextInt();
        	
            int[] Cost = new int[n];
            for(int j=0 ; j<n ; j++)
            {
                Cost[j]=in.nextInt();
            }
            
            for (int i = 0; i < n; i++) 
            {
            	for (int j = i; j < n; j++)
                {
                	if (i == j)
                              continue;
                       else
                       {
                    	   if (Cost[i] + Cost[j] > m)
                                     continue;
                    	   else 
                    		   if (Cost[i] + Cost[j] == m) 
                    		   {
                    			   System.out.println((i+1) + " " + (j+1));
                    		   }
                       }
                }
            }
	    }
        in.close();
	}
}