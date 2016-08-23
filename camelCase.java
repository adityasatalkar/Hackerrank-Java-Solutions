import java.util.*;

public class camelCase
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
//        System.out.println("Entered String is : " + s);
        
        int count=0;
                
        for(int i=0; i<s.length(); i++)
        {
			char c = s.charAt(i);
			if(i==0 && Character.isLowerCase(c))
			{
				count++;
			}
			else
				if(Character.isUpperCase(c))
				{
					count++;
				}
		}
        
        System.out.println(count);
 
    }
}