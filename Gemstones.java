//https://www.hackerrank.com/challenges/gem-stones?h_r=next-challenge&h_v=zen

import java.util.*;

public class Gemstones 
{
    public static void main(String[] args) 
    {

        Scanner s = new Scanner(System.in);

		int numTestCases = s.nextInt();

		HashSet<Character> baseSet = new HashSet<Character>();
		HashSet<Character> currSet = new HashSet<Character>();

		for (char c = 'a'; c <= 'z'; c++) 
        {
			baseSet.add(c);
		}

		while (numTestCases > 0) 
        {
			currSet.clear();
			char[] currentRockElements = s.next().toCharArray();

			for (int i = 0; i < currentRockElements.length; i++)
            {
				currSet.add(currentRockElements[i]);
			}

			baseSet.retainAll(currSet);

			--numTestCases;
		}

		System.out.println(baseSet.size());
    }
}