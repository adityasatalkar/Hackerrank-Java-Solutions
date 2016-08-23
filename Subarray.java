import java.io.*;
import java.util.*;

public class Subarray 
   {

    public static void main(String[] args)throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte T = Byte.parseByte(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        for(int i = 0; i < T; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
       
        int count = 0;
        for (int i = 0; i < T; i++) 
        {
            int sum = 0;
            for (int j = i; j < T; j++) 
            {
                sum += arr[j];
                if (sum < 0) 
                {
                	// If the most recent sum is -ve, count++
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
