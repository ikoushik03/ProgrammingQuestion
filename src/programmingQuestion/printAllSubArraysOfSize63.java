package programmingQuestion;

import java.util.Scanner;

public class printAllSubArraysOfSize63 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a=new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i]=scan.nextInt();
		}
		int l = scan.nextInt();
		
		for(int i=0; i<=a.length-l; i++)
		{
			for(int j=i; j<i+l; j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
			
		}
		
			
	}

}
