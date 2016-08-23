import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Knapsack 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int n=Integer.parseInt(st.nextToken());;
				int k=Integer.parseInt(st.nextToken());
				s=br.readLine();
				st=new StringTokenizer(s);
				int  wt[]=new int[n];			
				for(int i=0;i<n;i++)
				{
					wt[i]=Integer.parseInt(st.nextToken());					
				}
				int[] knapsack=new int[k+1];
				for(int i=1;i<=k;i++)
				{
					for(int j=0;j<n;j++)
					{
						if(wt[j]<=i)
						{
							knapsack[i]=Math.max(knapsack[i],wt[j]+knapsack[i-wt[j]]);
						}
					}
				}
				
				System.out.println(knapsack[k]);
			}
		}
	}
}