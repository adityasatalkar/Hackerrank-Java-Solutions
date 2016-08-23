import java.util.*;

public class MarsExploration 
{
	public static void main(String args[])
	{
//		System.out.println("Enter the String : ");
		
		Scanner in = new Scanner(System.in);
		String s=in.next();
		
		int count = 0;

		char[] sc=s.toCharArray();
		
		for (int i=0;i<sc.length;i++)
        {
			if(i%3==0)
			{
				if(sc[i]!='S')
				{
					count++;
				}
			}
			if(i%3==1)
			{
				if(sc[i]!='O')
				{
					count++;
				}
			}
			if(i%3==2)
			{
				if(sc[i]!='S')
				{
					count++;
				}
			}
        }
        System.out.print(count);		
	}
}