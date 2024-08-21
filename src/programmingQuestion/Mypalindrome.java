package programmingQuestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

class Q
{
	
	 static boolean isPalindrom(String str)
	{
		int i=0, j=str.length()-1;
		while(i<j)
		{
			
			if(str.charAt(i)==str.charAt(j))
			{
				i++;
				j--;
			}
			else 
			{
				return false;
			}
		}
		
		return true;
	}
	
	static int numberOfPalindrome(String s)
	{
		
		for(int i=0; i<s.length(); i++)
		{
			String n="";
			for(int j=i; j<s.length(); j++)
			{
				n=n+s.charAt(j);
				
				if(isPalindrom(n) && n.length()>1)
				{
					
					System.out.println(n);
				}
			}
			
		}
		return count;
		
	}
	
}

public class Mypalindrome {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println(Q.numberOfPalindrome(str));

	}

}
