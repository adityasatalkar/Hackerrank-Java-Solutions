import java.util.*;

public class SherlockAndArray 
{
	public static boolean isEven(int[] arr)
	{
	    if (arr.length == 0) 
	    {
	        return false;
	    }

	    int difference = arr[0] - Arrays.stream(arr).sum();
	    if (difference == 0) {
	        return true;
	    }

	    for (int i = 1; i < arr.length; i++) {
	        difference += arr[i-1];
	        difference += arr[i];

	        if (difference == 0) {
	            return true;
	        }
	    }
	    return false;
	}

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
	    int t = in.nextInt();

        for(int i=0 ; i<t ; i++)
	    {
        	int n = in.nextInt();
            int[] arr = new int[n];
            for(int j=0 ; j<n ; j++)
            {
                arr[j]=in.nextInt();
            }
            System.out.println(isEven(arr) ? "YES" : "NO");
	    }
    }
}