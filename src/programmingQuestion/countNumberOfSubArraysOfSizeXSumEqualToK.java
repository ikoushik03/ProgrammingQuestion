package programmingQuestion;

import java.util.Scanner;

public class countNumberOfSubArraysOfSizeXSumEqualToK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int x = scan.nextInt();
		int k = scan.nextInt();
		
		int count=0;
		for(int i=0; i<=ar.length-x; i++ )
		{
			int sum=0;
			for(int j=i; j<i+x; j++)
			{
				sum=sum+ar[j];
			}
			
			
			
			if(sum==k)
			{
				count++;
			}
			
					
		}
		System.out.println(count+" ");
		

		
	}

}
