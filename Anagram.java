
import java.io.*;
import java.util.*;

public class Anagram 
{
    private static final byte ALPHABET_LENGTH = 26;
    private static final byte ASCII_ALPHABET_OFFSET = 97;
    public static void main(String[] args) throws IOException
    {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(byte T = Byte.parseByte(br.readLine()); T > 0; --T)
        {
        	short numChanges = -1;
            char[] ab = br.readLine().toCharArray();
            short max = (short)ab.length;
            if((max & 1) == 0)
            {
                numChanges = 0;
                short mid = (short)(max >> 1);
                short[] map = new short[ALPHABET_LENGTH];
                for(short i = mid; i < max; map[ab[i++] - ASCII_ALPHABET_OFFSET]++){}
                for(short i = 0; i < mid; numChanges += (map[ab[i++] - ASCII_ALPHABET_OFFSET]-- > 0) ? 0 : 1){}
            }
            sb.append(numChanges + "\n");
        }
        System.out.print(sb);
    }
}

/*
public class Anagram
{
    static void isAnagram(String s1, String s2)
    {
        //Removing all white spaces from s1 and s2
 
        String copyOfs1 = s1.replaceAll("\\s", "");
 
        String copyOfs2 = s2.replaceAll("\\s", "");
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
 
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
 
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
 
            //Sorting both s1Array and s2Array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Checking whether s1Array and s2Array are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
 
        //Output
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
 
    public static void main(String[] args)
    {

        
        isAnagram("Mother In Law", "Hitler Woman");
 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");
    }
}
*/