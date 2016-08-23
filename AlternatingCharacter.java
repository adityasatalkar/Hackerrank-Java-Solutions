//https://www.hackerrank.com/challenges/alternating-characters?h_r=next-challenge&h_v=zen

import java.util.*;

public class AlternatingCharacter 
{
	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        String[] s = new String[T];
        
        for( int i = 0 ; i < T ; i++ )
        {
            s[i] = in.next();
        }
           
        for(int i = 0 ; i < s.length ; i++ )
        {
            int count=0;
            char[] c = s[i].toCharArray();
        
            for(int j = 0 ; j < c.length - 1 ; j++ )
            {
                if( c[j] == c[j+1] )
                    count++;
            }
            
            System.out.println(count);
        }
    }
}