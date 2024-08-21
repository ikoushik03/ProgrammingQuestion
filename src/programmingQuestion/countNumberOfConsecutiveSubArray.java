package programmingQuestion;

import java.util.Scanner;

public class countNumberOfConsecutiveSubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
			
		}
		
		int si=0;
		int ei=0;
		int count=0;
		for(int i=0; i<n-1; i++)
		{
			if(ar[i+1]-ar[i]==1)
			{
				ei++;
			}
			else
			{
				if(ei-si>0 )
				{
					count++;
				}
				
				si=i+1;
				ei=i+1;
				
			}
		}
		if(ei-si>0 )
		{
			count++;
		}
		System.out.println(count);
			
	}

}
