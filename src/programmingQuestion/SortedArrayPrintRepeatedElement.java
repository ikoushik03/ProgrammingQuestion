package programmingQuestion;

import java.util.Scanner;

public class SortedArrayPrintRepeatedElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int count=1;
		for(int i=0; i<n-1; i++)
		{
			if(ar[i]==ar[i+1])
			{
				count++;
				
			}
			else
			{
				if(count>=2)
				{
					System.out.println(ar[i]);

				}
				count =1;
			}
			
			
		}
		if(count>=2)
		{
			System.out.println(ar[ar.length-1]);

		}
	}

}
