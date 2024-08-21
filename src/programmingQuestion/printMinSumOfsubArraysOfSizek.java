package programmingQuestion;

import java.util.Scanner;

public class printMinSumOfsubArraysOfSizek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=scan.nextInt();
		}
		
		int l = scan.nextInt();
		int min=Integer.MAX_VALUE;
		for(int i=0; i<a.length-l; i++)
		{
			int sum=0;
			for(int j=i; j<i+l; j++)
			{
				sum=sum+a[j];
			}
			
			if(sum<min)
			{
				min=sum;
			}
			sum=0;
		}
		System.out.println(min);
		
	}
	

}
