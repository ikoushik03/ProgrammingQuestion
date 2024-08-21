package programmingQuestion;

import java.util.Scanner;

public class reverseString1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String ss="";
		for(int i=str.length()-1; i>=0; i--)
		{
			ss=ss+str.charAt(i);
		}
		System.out.println(ss);
	}

}
