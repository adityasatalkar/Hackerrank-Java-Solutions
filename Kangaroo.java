// https://www.hackerrank.com/challenges/kangaroo

import java.util.*;

public class Kangaroo 
{

    public static void main(String[] args) 
    {

        Scanner scanner=new Scanner(System.in);
		String [] inputs=scanner.nextLine().split(" ");
        
		int x1=Integer.parseInt(inputs[0]);
		int v1=Integer.parseInt(inputs[1]);
		int x2=Integer.parseInt(inputs[2]);
		int v2=Integer.parseInt(inputs[3]);        
        
        int dx= x1 - x2;
		int dv=v2-v1;
		if( x1 < x2 && v1 < v2 )
        {
			System.out.println("NO");
			System.exit(1);
		}
        else if(dv ==0 )
        {
            System.out.println("NO");
			System.exit(1);
        }
		else
        {
			if( dx %dv ==0 && dx *dv >0)
            {
				// mod operator states that there is no reminder thus the dvivion gives whole number
				System.out.println("YES");
				System.exit(1);	
			}
			else
            {
				System.out.println("NO");
			}
        }
    }
}