package programmingQuestion;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []ar=new int[n];
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int l = scan.nextInt();
		for(int i=0; i<=ar.length-l; i++)
		{
			for(int j=0; j<i+l; j++)
			{
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
		
	}

}
