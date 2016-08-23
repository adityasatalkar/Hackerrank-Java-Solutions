import java.util.Scanner;

public class Candies 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		int arr[]=new int[N];
		int i=0;
		while(i<N)
		{
			arr[i]=sc.nextInt();
			i++;
		}
		int candie[]=new int[N];
		candie[0]=1;
		for( i=1;i<N;i++)
		{
			candie[i]=1;
			if(arr[i]>arr[i-1])
			{
				candie[i]=candie[i-1]+1;
			}
        }
        int sum=candie[N-1];
        for( i=N-2;i>=0;i--)
		{
            if(arr[i]>arr[i+1])
            {
                candie[i]=Math.max(candie[i],candie[i+1]+1);
            }
            sum+=candie[i];
        }
		System.out.println(sum);
		sc.close();
	}
}