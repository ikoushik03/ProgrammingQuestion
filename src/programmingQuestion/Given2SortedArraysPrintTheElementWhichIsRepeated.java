package programmingQuestion;

import java.util.Scanner;

public class Given2SortedArraysPrintTheElementWhichIsRepeated {

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
		
		int i=0; int j=0;
		while(i<a.length && j<ar.length)
		{
			if(a[i]==ar[j])
			{
				System.out.print(a[i]+ " ");
				i++; 
				j++;
			}
			
			else if(a[i]<ar[j])
			{
				i++;
			
		    }
			else
			{
				j++;
			}
			
			
			
		}
		
		
	}

}
