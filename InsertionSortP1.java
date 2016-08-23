import java.util.*;

public class InsertionSortP1 
{

    public static void insertIntoSorted(int[] arr) 
    {
        int numToInsert = arr[arr.length-1];
        int pos = arr.length-2;
        while(pos>=0)
        {
            if(arr[pos]>numToInsert)
            {
                arr[pos+1]=arr[pos];
                pos--;
                printarray(arr);
                
            }
            else
            {
                arr[pos+1]=numToInsert;
                printarray(arr);
                break;
            }
        }
        if(pos == -1)
        {
            arr[0]=numToInsert;
            printarray(arr);
        }
        
    }
    
    /* Tail starts here */
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] arr = new int[s];
         for(int i=0;i<s;i++)
         {
            arr[i]=in.nextInt(); 
         }
         insertIntoSorted(arr);
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