package programmingQuestion;

import java.util.Scanner;

class F
{
	boolean  isPalin(String s)
	{
		int i=0;
		int j=s.length()-1;
		
		while(i<j)
			
		{
			if(s.charAt(i)==s.charAt(j))
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
	
	void fun(String s)
	{
		String ss="";
		int k=0;
	
		for(int l=0; l<s.length()-1; l++)
		{
			ss="";
			for(int i=l;i<s.length();i++)
			{
				ss+=s.charAt(i);
				if(isPalin(ss))
				{
					System.out.println(ss);
				}
				
			}
		}

	}
}

public class longestStringPlaindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		F f = new F();
		f.fun(str);
	}

}
