package programmingQuestion;

import java.util.Scanner;
import java.util.TreeSet;

public class kou {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String str = sc.nextLine();
	TreeSet<String> ts = new TreeSet<>();
	String ss = "";
	String num="";
	for(int i = 0; i<str.length();i++)
	{
		if(str.charAt(i)>='A' && str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z')
		{
			ss+=str.charAt(i);
		}
		else if(str.charAt(i)>='1'&&str.charAt(i)<='9')
		{
			num+=str.charAt(i);
		}
		else if(ss.length()>0)
		{
			ts.add(ss);
			ss="";
		}
	
		
	}
	ts.add(ss);
	ts.add(num);
	System.out.println(ts);
}
}
