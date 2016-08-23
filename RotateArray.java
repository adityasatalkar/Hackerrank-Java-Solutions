//Given an array of n integers and a number, d, perform d left rotations on the array. 
//Then print the updated array as a single line of space-separated integers.

import java.util.Scanner;

public class RotateArray 
{
	/*Function to left rotate arr[] of size n by d*/
	void leftRotate(int arr[], int d, int n) 
	{
		int i;
		for (i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
	}

	void leftRotatebyOne(int arr[], int n) 
	{
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
	}

	/* utility function to print an array */
	void printArray(int arr[], int size) 
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver program to test above functions
	public static void main(String[] args) 
	{
		RotateArray rotate = new RotateArray();
//    	System.out.println("Input Arr Size : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//      System.out.println("Enter value for d : ");
        Scanner ins = new Scanner(System.in);        
        int d = ins.nextInt();
        
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++)
        {
            arr[arr_i] = in.nextInt();
        }

		rotate.leftRotate(arr, d, n);
		rotate.printArray(arr, n);
	}

}
