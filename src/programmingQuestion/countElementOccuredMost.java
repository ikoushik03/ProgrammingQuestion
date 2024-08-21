package programmingQuestion;

import java.util.Scanner;

public class countElementOccuredMost {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]ar=new int[n];
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		
		int count=1;
		int element=0;
		int max=0;
		for(int i=0; i<n-1; i++)
		{
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else
			{
				if(count>max)
				{
					max=count;
					element=ar[i];
				}
				count=1;
			}
			
		}
		if(count>max)
		{
			max=count;
			element=ar[ar.length-1];
		}
		System.out.println(element+"-"+ max);

		
	}

}
