package shorting;

import java.util.Scanner;

public class bubbleShort {

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
		for(int j=i+1; j<n; j++)
		{
			if(ar[i]>ar[j])
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				
			}
		}
	}
	for(int i=0; i<n; i++)
	{
		System.out.print(ar[i]+" ");
	}
	
	
	}

}
