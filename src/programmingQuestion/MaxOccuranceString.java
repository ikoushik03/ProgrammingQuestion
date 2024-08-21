package programmingQuestion;

import java.util.Scanner;

public class MaxOccuranceString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		
		int count=1;
		int max=0;
		int value=0;
		for(int i=0; i<str.length(); i++)
		{
			
			for(int j=1; j<str.length(); j++)
			{
				if(str.charAt(i)==str.charAt(j))	
				{
					count++;
					
				}
				else 
				{
					if(count>max)
					{
						max=count;
						value=str.charAt(i);
					}
					count=1;
				}
			}
				
			
		}
		
		
		System.out.println("value"+" "+value+"count"+" "+max);
	}

}
