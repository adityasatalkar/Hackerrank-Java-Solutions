//https://www.hackerrank.com/challenges/string-construction

import java.util.*;

public class StringConstruction 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++)
        {
            String s = in.next();
            Set<Character> hash = new HashSet<>();
            char[] c = s.toCharArray();
            for(char ch: c)
            {
                hash.add(ch);
            }
            System.out.println(hash.size());
        }
    }
}