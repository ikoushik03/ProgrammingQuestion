package programmingQuestion;

import java.util.Scanner;

public class fibonacii {

	public static void main(String[] args) {
		String str="india is india to the india";
		String s ="india";
		int count = 0;
		String check="";
		for(int i = 0; i<str.length();i++)
		{
			check+=str.charAt(i);
			if(check.equals(s))
			{
				count++;
			}
		if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
		{
			check="";
		}
		}
		System.out.println(count);
	}

}
