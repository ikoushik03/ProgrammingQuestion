package programmingQuestion;

import java.util.Scanner;

public class InsortedCountNumOfElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]ar=new int[n];
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
			
		}
		
		boolean[] arr=new boolean[n];
		
		for(int i=0; i<n; i++)
		{
			int count=1;
			for(int j=i+1; j<n; j++)
			{
			 if(arr[j]==false)
			 {
				 if(ar[i]==ar[j])
				 {
					 count++;
					 arr[j]=true;
				 }
			 }
			}
			if(arr[i]==false)
			{
				System.out.println(ar[i]+"-"+count);
			}
			
		}
	}

}
