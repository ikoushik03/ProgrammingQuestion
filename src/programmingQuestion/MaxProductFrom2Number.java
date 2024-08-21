package programmingQuestion;

import java.util.Scanner;

public class MaxProductFrom2Number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
	if(findMin(ar)>findMax(ar))
		System.out.println(findMin(ar));
	else
		System.out.println(findMax(ar));
	}
	public static int findMin(int arr[])
	{
		int fl=Integer.MAX_VALUE;
		int sl = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]<fl)
			{
				sl=fl;
				fl=arr[i];
				
			}
			else if(arr[i]<sl)
			{
				sl = arr[i];
			}
		}
		return fl*sl;
	}
	public static int findMax(int arr[])
	{
		int fl=Integer.MIN_VALUE;
		int sl = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				sl=fl;
				fl=arr[i];
				
			}
			else if(arr[i]>sl)
			{
				sl = arr[i];
			}
		}
		return fl*sl;
	}

}
