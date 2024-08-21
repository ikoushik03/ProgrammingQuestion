package programmingQuestion;

import java.util.Scanner;

public class printBetweenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++)
		{
			if(arr[i]%2!=0 && arr[i+1]%2!=0 )
			{
				System.out.print(arr[i]+"*");
			}
			else if(arr[i]%2==0 && arr[i+1]%2==0)
			{
				System.out.print(arr[i]+"#");

			}
			else 
			{
				System.out.print(arr[i]+"$");

			}
		}
		System.out.println(arr[arr.length-1]);
		
		
	}

}
