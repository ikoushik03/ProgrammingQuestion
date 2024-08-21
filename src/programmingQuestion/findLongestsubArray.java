package programmingQuestion;

import java.util.Scanner;

public class findLongestsubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []arr=new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int si=0;
		int ei=0;
		int start=0;
		int end=0;
				
		for(int i=0; i<n-1; i++)
		{
			if(arr[i+1]-arr[i]==1)
			{
				ei++;
			}
			else 
			{
				if(ei-si>end-start)
				{
					start=si;
					end=ei;
				}
				si=i+1;
				ei=i+1;
			}
			if(ei-si>end-start)
			{
				start=si;
				end=ei;
			}
		}
		for(int i=start; i<=end; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
