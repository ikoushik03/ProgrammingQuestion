package programmingQuestion;

import java.util.Scanner;

public class convertTwoSortedArrayIntoSingleSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		int m = scan.nextInt();
		int[] arr=new int[m];
		
		for(int j=0; j<m; j++)
		{
			arr[j]=scan.nextInt();
		}
		
		int []res=new int[ar.length+arr.length];
			
		int i=0; int j=0; int k=0; 
		while( i<ar.length &&  j<arr.length) 
		{
			if(arr[j]<ar[i])
			{
				res[k]=arr[j];
				k++;
				j++;
						
			}
			else 
			{
				res[k]=ar[i];
				k++;
				i++;
			}
		}
		
		while(i<ar.length)
		{
			res[k]=ar[i];
			k++;
			i++;
		}
		while(j<arr.length)
		{
			res[k]=arr[j];
			k++;
			j++;
		}
		for(int p=0; p<res.length; p++)
		{
			System.out.print(res[p]+" ");
		}
		

	}

}
