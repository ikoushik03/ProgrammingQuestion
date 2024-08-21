package programmingQuestion;

import java.util.Scanner;

class K
{
	static int  fun(String s)
	{
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>=0 || s.charAt(i)<=9)
			{
				count++;
			}
		}
		return count;
	}
}

public class HowManyNumInAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(K.fun(str));
		

	}

}
