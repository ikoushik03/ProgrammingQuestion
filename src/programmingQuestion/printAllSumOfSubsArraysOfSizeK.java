package programmingQuestion;

import java.util.Scanner;

public class printAllSumOfSubsArraysOfSizeK {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a=new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i]=scan.nextInt();
		}
		int l = scan.nextInt();
		
		int sum=0;
		for(int i=0; i<=a.length-l; i++)
		{
			for(int j=i; j<i+l; j++)
			{
				sum=sum+a[j];
			}
			System.out.println(sum);
			sum=0;
						
		}
		System.out.println();
		

	}

}
