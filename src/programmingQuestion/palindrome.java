package programmingQuestion;

import java.util.Scanner;


class kk
{
	static boolean res(String str)
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
}

public class palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
	    System.out.println(kk.res(str));
	
	}

}
