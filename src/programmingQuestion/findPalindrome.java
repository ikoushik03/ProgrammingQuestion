package programmingQuestion;

import java.util.Scanner;

class D
{
	String fun(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i!=j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			
			else
			{
				return "not palindrome";
			}
		}
		return "palindrome";
	}
	
	
}

public class findPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		D d = new D();
		System.out.println(d.fun(str));
		
		
		
		
	}

}
