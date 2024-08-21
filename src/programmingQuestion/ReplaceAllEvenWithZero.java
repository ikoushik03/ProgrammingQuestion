package programmingQuestion;

import java.util.Scanner;

public class ReplaceAllEvenWithZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]ar=new int[n];
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
			
		}
		for(int i=0; i<n; i++)
		{
			if(ar[i]%2==0)
			{
				ar[i]=0;
			}
			System.out.print(ar[i]+" ");
		}
	}

}
