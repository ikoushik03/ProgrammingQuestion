package shorting;

import java.util.Scanner;

public class selectionShort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []ar=new int[n];
		
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			int k=i;
			for(int j=i+1; j<n;j++)
			{
				if(ar[j]<ar[k])
				{
					k=j;
				}
			}
			int temp=ar[i];
			ar[i]=ar[k];
			ar[k]=temp;
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
