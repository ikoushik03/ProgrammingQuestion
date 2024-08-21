package programmingQuestion;

import java.util.Scanner;

class Demo
{
	static void fun(String s)
	{
		int vc=0;
		int cc=0;
		int nc=0;
		int sc=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>'A' && ch<'Z'))
			{
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || 
						s.charAt(i)=='o' || s.charAt(i)=='u'
						|| s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' ||
						s.charAt(i)=='O' || s.charAt(i)=='U')
				       {
					    vc++;
				       }
				else 
				{
					cc++;
				}
			}				
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				nc++;
			}
			
			else 
			{
				sc++;
			}
		}
		System.out.println("vc"+" "+ vc);
		System.out.println("cc"+" "+ cc);
		System.out.println("nc"+" "+ nc);
		System.out.println("sc"+" "+ sc);

	
	}
}

public class CountCharInAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		Demo.fun(str);
		
		
	}

}
