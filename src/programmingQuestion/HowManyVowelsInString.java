package programmingQuestion;

import java.util.Scanner;

class Aa
{
	
	int fun(String s)
	{
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'
				|| s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
			{
				count++;
			}
			
		}
		return count;
	}
}

public class HowManyVowelsInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		Aa a = new Aa();
		System.out.println(a.fun(str));
		
	}

}
