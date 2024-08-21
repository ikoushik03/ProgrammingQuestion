package programmingQuestion;

import java.util.Scanner;

public class noVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		for(int i=0; i<str.length(); i++)
		{
			int count=0;
			char ch = str.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E' || ch=='I'|| ch=='O'||ch=='U')
					
			{
				count++;
			}
		}
		System.out.println(count);		
	}

}
