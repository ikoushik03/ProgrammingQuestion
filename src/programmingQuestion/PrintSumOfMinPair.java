package programmingQuestion;

import java.util.Scanner;

public class PrintSumOfMinPair {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		
		int fl=Integer.MAX_VALUE;
		int sl=Integer.MAX_VALUE;
		for(int i=0; i<n; i++)
		{
			if(ar[i]<fl)
			{
				sl=fl;
				fl=ar[i];
			}
			else if(ar[i]<sl)
			{
				sl=ar[i];
			}
		}
		System.out.println(sl+fl);
	}
	}


