package programmingQuestion;

import java.util.Scanner;

public class DecendingSmallestRepeatingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		for(int i=ar.length-2; i>=0; i--)
		{
			if(ar[i]==ar[i+1])
			{
				System.out.println(ar[i]);
				break;
			}
		}
			
	}

}
