package programmingQuestion;

import java.util.Scanner;

public class PairSumPrintPairSumMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int firstLargest=ar[0];
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{
			if(ar[i]>firstLargest)
			{
				secondLargest=firstLargest;
				firstLargest=ar[i];
			}
			
			else if(ar[i]>secondLargest  )
			{
				secondLargest=ar[i];
			}
			
		}
		System.out.println(secondLargest+firstLargest);

	}

}
