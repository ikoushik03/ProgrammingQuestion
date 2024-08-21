package programmingQuestion;

import java.util.Scanner;

public class printLongestConsecutiveSubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int start=0;
		int end=0;
		int si=0;
		int ei=0;
		for(int i=0; i<n-1; i++)
		{
			if(ar[i+1]-ar[i]==1)
			{
				ei++;
			}
			else 
			{
				if(ei-si>end-start)
				{
					end=ei;
					start=si;
				}
				si=i+1;
				ei=i+1;
			}
		}
		if(ei-si>end-start)
		{
			end=ei;
			start=si;
		}
		for(int i=start; i<=end; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	
	}

}
