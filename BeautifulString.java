import java.util.Scanner;

public class BeautifulString 
{
	public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();	    
	       
	    String s = in.next();
	    
	    char[] chars = s.toCharArray();

	    int steps = 0;
	    
	    for( int i=0 ; i< n-2 ; i++ )
	    {
	        if (chars[i] == '0' && chars[i + 1] == '1' && chars[i + 2] == '0')
	        {
	            steps++;                 
	            chars[i+2] = '1';
	        }
	    }
	    System.out.println(steps);
	}
}