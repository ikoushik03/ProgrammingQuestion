package programmingQuestion;

import java.util.Scanner;

	public class printNumberOfPalindrome
	{
		public static int countPlin(String str)
		{
			int count = 0;
		//	String s="";
			for(int i = 0; i<str.length();i++)
			{
				String s="";
	
				for(int j=i;j<str.length();j++)
				{
					s+=str.charAt(j);
					if(isPlindrom(s)&&s.length()>1)
					{
						count++;
                    //	if(s.length()>1)
						System.out.println(s);
					}
				}
			}
			return count;
		}
		public static boolean isPlindrom(String str)
		{
			int i = 0;
			int j = str.length()-1;
			while(i<j)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					i++;
					j--;
				}
				else {
					return false;
				}
			}
			return true;
		}
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	String str =sc.next();
	
	System.out.println(countPlin(str));
	}	
	}
	
