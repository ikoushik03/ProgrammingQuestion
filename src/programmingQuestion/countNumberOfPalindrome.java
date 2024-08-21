package programmingQuestion;

import java.util.Scanner;

class A
{
	public static boolean fun(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i!=j)
		{
			if( str.charAt(i)==str.charAt(j))
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
	
	public static void fun1(String str)
	{
		
		String s="";
		for(int i=0; i<str.length(); i++)
		{
			 s="";
			for(int j=i; j<str.length(); j++)
			{
				s=s+str.charAt(j);
				
				if(fun(s) && s.length()>1)
				{
					System.out.println(s);
				//	System.out.println("koushik");
				}
				
			}
		}
		
	}


public class countNumberOfPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
	//	String str ="aabbaba";
		A.fun1(str);
	}

}}
