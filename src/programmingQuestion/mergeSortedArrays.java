package programmingQuestion;

import java.util.Scanner;

public class mergeSortedArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a=new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i]=scan.nextInt();
		}	
		
		int m = scan.nextInt();
		int[] ar=new int[m];
		
		for(int i=0; i<m; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int o = scan.nextInt();
		int[] arr=new int[o];
		
		for(int i=0; i<o; i++)
		{
			arr[i]=scan.nextInt();
		}
		int res[]=new int[a.length+ar.length+arr.length];
		
		int i=0; int k=0;
		
		
		while(k<res.length) 
		{
			if(i<a.length)
			{
				res[k]=a[i];
				k++;
			}
			
			if(i<ar.length)
			{
				res[k]=ar[i];
				k++;
			}
			
			if(i<arr.length)
			{
				res[k]=arr[i];
				k++;
			}
			i++;
			
		}
		
		
		
		
		for(int p=0; p<12; p++)
		{
			System.out.print(res[p]+" ");
		}
		
	}

}
