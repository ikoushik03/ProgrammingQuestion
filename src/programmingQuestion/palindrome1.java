package programmingQuestion;

import java.util.Scanner;
class jack
{
	static boolean isPalindrom(String s)
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
}

public class palindrome1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(jack.isPalindrom(str));
	}

}
