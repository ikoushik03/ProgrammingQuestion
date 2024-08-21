package programmingQuestion;

import java.util.Scanner;

public class repeatingElementInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);///aaabbc:a3b2c1
		
		String str = scan.next();
		
		int count=1;
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			else 
			{
				if(count>=1)
				{
					System.out.println(str.charAt(i)+""+count);
				}
				count=1;
			}
			
			
				
		}
		
		System.out.println(str.charAt(str.length()-1)+""+count);
	}

}
