package programmingQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		String[] breaks = breakString(str,20);
		for(String ss:breaks)
		{
			System.out.println(ss);
		}
	}
	public static String[] breakString(String input,int breakpoint)
	{
		ArrayList<String> broken = new ArrayList<>();
		while(input.length()>breakpoint)
		{
			int spaceIndex = input.lastIndexOf(" ",breakpoint);
			if(spaceIndex== -1)
			{
				spaceIndex = breakpoint;
			}
			broken.add(input.substring(0,spaceIndex));
			input=input.substring(spaceIndex+1);
			
		}
		broken.add(input);
		return broken.toArray(new String[0]);
	}

}
