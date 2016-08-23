import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram 
{

	public static void main(String[] args) throws IOException 
	{
//		System.out.println("Input String : ");
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String S = br.readLine();
			S = S.toLowerCase();
			S = S.replaceAll("\\s+","");
//			System.out.println(S);
			
			int l = S.length();
			
			final Set<Character> remainingLetters = new HashSet<>();
			
			for(char ch='a';ch<='z';ch++)
			{
				remainingLetters.add(ch);
			}
			for(int i=0;i<l;i++)
			{
				remainingLetters.remove(S.charAt(i));
			}
			if(remainingLetters.isEmpty()==true)
			{
				System.out.println("pangram");
			}
			else
			{
				System.out.println("not pangram");
			}
	
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}