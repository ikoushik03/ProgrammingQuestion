package programmingQuestion;

import java.util.Scanner;

class M
{
	static int fun(String s)
	{
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			count++;
		}
		
		return count;
	}
}

public class howManyAlphabtes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(M.fun(str));
		
	}

}
