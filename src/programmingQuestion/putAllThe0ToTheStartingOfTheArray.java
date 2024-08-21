package programmingQuestion;

import java.util.Scanner;

public class putAllThe0ToTheStartingOfTheArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
			
		}
		
		
//		5 -1 3 -1 4 5 5 3 8 2
//		-1 -1 5 3 4 5 5 3 8 2
		int i=ar.length-1; 
		int j=ar.length-1;
		while(i>=0)
		{
			if(ar[i]==-1)
			{
				i--;
			}
			else 
			{
				ar[j--]=ar[i--];
				
			}
		}
		
		while(j>=0)
		{
			ar[j--]=-1;
		}
		
		for(int p=0; p<n; p++)
		{
		 System.out.print(ar[p]+" ");	
		}
			
	}

}
