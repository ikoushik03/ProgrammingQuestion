package programmingQuestion;

import java.util.Scanner;



public class MissingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []ar=new int[n];
		
		for(int i=0; i<n-1; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		
		int ArraySum=0;
		int sum =n*(n+1)/2;
		for(int i=0; i<n-1; i++)
		{
		   ArraySum=ArraySum+ar[i];	
		}
		
		System.out.println(sum-ArraySum);
	}

}
