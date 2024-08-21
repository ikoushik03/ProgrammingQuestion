package programmingQuestion;

import java.util.Scanner;

public class printAllSubArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
	//	int l = scan.nextInt();
		for(int l=1; l<=ar.length; l++)
		{
			for(int i=0; i<=ar.length-l; i++)
			{
				for(int j=i; j<i+l; j++)
				{
					System.out.print(ar[j]+" ");
				}
				System.out.println();
		}
	}

	}}
