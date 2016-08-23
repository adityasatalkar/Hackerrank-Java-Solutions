import java.io.*;
import java.util.*;

public class InsertionSortP2 
{

    public static void insertionSortParrt2(int[] arr)
    {       
        int pos = 1;
        while (pos < arr.length)
        {
            int currentPos = pos;
            for(int i = pos-1; i>=0 ; i-- )
            {
                if(arr[currentPos]<arr[i])
                {
                    //insert the value
                    int temp = arr[currentPos];
                    arr[currentPos] = arr[i];
                    arr[i]=temp;
                    currentPos--;
                }
            }
            pos++;
            printarray(arr);
        }
    }  
      
    public static void main(String[] args) 
    {
    	Scanner in = new Scanner(System.in);
    	int s = in.nextInt();
       
    	int[] arr = new int[s];
       
    	for(int i=0;i<s;i++)
    	{
    		arr[i]=in.nextInt(); 
    	}
    	insertionSortParrt2(arr);                        
    }    
    
    private static void printarray(int[] arr) 
    {
    	for(int n: arr)
    	{
    		System.out.print(n+" ");
    	}
    	System.out.println("");
    }
}