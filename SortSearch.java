import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SortSearch 
{

    public static void main(String[] args) 
    {

        //System.out.println("Enter element to be searched : ");
        Scanner in = new Scanner(System.in);
    	int v = in.nextInt();

    	
    	//System.out.println("Input Arr Size : ");
        int n = in.nextInt();
        
        //enter elements into array
        int arr[] = new int[n];

        
        for(int arr_i=0; arr_i < n; arr_i++)
        {
            arr[arr_i] = in.nextInt();
        }

        
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]==v)
            {
            	System.out.print (i);
            }
        }

    }
}