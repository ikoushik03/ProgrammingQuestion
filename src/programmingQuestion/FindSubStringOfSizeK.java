package programmingQuestion;

import java.util.Scanner;

public class FindSubStringOfSizeK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		int k = scan.nextInt();
		
		
		for(int i=0; i<=str.length()-k; i++)
		{
			String s="";
			for(int j=i; j<i+k; j++)
			{
				s=s+str.charAt(j);
			}
			System.out.println(s);
		}
		
	}

}
