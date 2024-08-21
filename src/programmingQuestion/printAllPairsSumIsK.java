package programmingQuestion;

import java.util.Scanner;

public class printAllPairsSumIsK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]ar=new int[n];
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(ar[i]+ar[j]==k)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
			
		}
		
	}

}
