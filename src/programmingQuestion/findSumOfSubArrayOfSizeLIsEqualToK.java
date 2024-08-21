package programmingQuestion;

import java.util.Scanner;

public class findSumOfSubArrayOfSizeLIsEqualToK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=scan.nextInt();
		}
		
		int l = scan.nextInt();
		int k = scan.nextInt();
		
		for(int i=0; i<=a.length-l; i++)
		{
			int sum=0;
			for(int j=i; j<i+l; j++)
			{
				sum=sum+a[j];
			}
			
			if(sum==k)
			{
				for(int j=i; j<i+l; j++)
				{
					System.out.print(a[j]+" ");
				}
				System.out.println();
			}
			
			
		}
		
		
		
	}

	}


