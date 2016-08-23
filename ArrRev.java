//Given an array, A, of N integers, print each element in reverse order 
//as a single line of space-separated integers.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrRev 
{
    public static void main(String[] args) 
    {
    	System.out.println("Input Arr Size : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++)
        {
            arr[arr_i] = in.nextInt();
        }
        System.out.println("REV array is : ");
        
        for(int i=n;i>0;i--)
        {
        	System.out.print (arr[i-1]+ " ");
        }
    }
}
