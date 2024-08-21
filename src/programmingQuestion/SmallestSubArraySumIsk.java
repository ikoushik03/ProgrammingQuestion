package programmingQuestion;

import java.util.Scanner;

public class SmallestSubArraySumIsk {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int i=ar.length-1;
		int j=ar.length-1;
		
		while(i>=0)
		{
			if(ar[i]==-1)
			{
				i--;
			}
			else 
			{
				ar[j]=ar[i];
				j--;
				i--;
			}
		}
		while(j>=0)
		{
			ar[j]=-1;
			j--;
		}
			
		for(int k=0; k<ar.length; k++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
	

}
