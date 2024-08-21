package programmingQuestion;

import java.util.Scanner;

public class countTheElementOccurMost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int max =0;
		int value = 0;
		int count = 1;
		for(int i = 0; i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
			}
			else {
				if(count>max)
				{
					max = count;
					value= arr[i];
				}
				count=1;
			}
		}
		if(count>max)
		{
			max = count;
			
			value = arr[arr.length-1];
		}
		System.out.println("values "+value+" "+"count "+max);
		
	}

}







































//Scanner scan = new Scanner(System.in);
//int n = scan.nextInt();
//int[] ar=new int[n];
//for(int i=0; i<n-1; i++)
//{
//	ar[i]=scan.nextInt();
//}
//
//int count=1;
//int max=0;
//int value=0;
//for(int i=0; i<n-1; i++)
//{
//	if(ar[i]==ar[i+1])
//	{
//		count++;
//	}
//	else
//	{
//		if(count>max)
//		{
//			max=count;
//			value=ar[i];
//		}
//		count =1;
//	}
//	
//}
//if(count>max)
//{
//	max = count;
//}
//System.out.println(value +":"+max);
//