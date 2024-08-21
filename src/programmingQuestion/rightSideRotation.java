package programmingQuestion;

import java.util.Scanner;

public class rightSideRotation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[]ar=new int [n];
		int k = scan.nextInt();
		
		for(int i=0; i<ar.length-1; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		
		
	   while(k>0)
	   {
		   
		   
		   int temp=ar[ar.length-1];
		   for(int i=ar.length-1; i>0; i--)
		   {
			   ar[i]=ar[i-1];
		   }
		   
		   ar[0]=temp;
		   k--; 
	   }
	   
	
	
	for(int i=0; i<ar.length-1; i++)
	{
		System.out.print(ar[i]+ " ");
	}
	
	}
}
