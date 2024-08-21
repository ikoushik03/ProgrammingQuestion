package programmingQuestion;

import java.util.Scanner;

public class MaxProductPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int fl=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		int max1=Integer.MAX_VALUE;
		int max2=Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]>fl)
			{
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]>sl)
			{
				sl=arr[i];
			}
		}
		for(int i=0; i<n; i++)
		{
			if(arr[i]<max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]<max2)
			{
				max2=arr[i];
			}
		}
		int p1=sl*fl;
		int p2=max1*max2;
		
//		if(p1>p2)
//		{
//			System.out.println(p1);
//		}
//		else 
//		{
//			System.out.println(p2);
//		}
		
		System.out.println((p2>p1?p2:p1));
		
	}

}
