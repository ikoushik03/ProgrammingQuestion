package programmingQuestion;

import java.util.Scanner;

public class missingNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		for(int i=0; i<n-1; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int arraySum=0;
		
		int  Sum=n*(n+1)/2;
		for(int i=0; i<n-1; i++)
		{
			Sum=Sum-ar[i];
			
		}
		//int m=Sum-arraySum;
		System.out.println(Sum);
		
	}

}
