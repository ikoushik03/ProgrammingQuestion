package programmingQuestion;

import java.util.Scanner;

public class putAllThe0ToTheEndingOfTheArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
			
		}
		
		int i=0;
		int j=0;
		while(i<ar.length)
		{
			if(ar[i]==0)
			   {
				  i++; 
			   }
			   else 
			   {
				   ar[j]=ar[i];
				   i++;
				   j++;
			   }
		}
	    while(j<ar.length)
	    {
	    	ar[j]=0;
	    	j++;
	    }
	    
	    for(int p=0; p<n; p++)
	    {
	    	System.out.print(ar[p]+" ");
	    }
		
	}

}
