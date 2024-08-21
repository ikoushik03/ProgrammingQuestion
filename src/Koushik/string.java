package Koushik;

public class string 
{
	public static void Main(string[] args)
	{
		String str = "tree";
		
		for(int i=0; i<str.length()-1; i++)
		{
			for(int j=1; j<str.length()-1; j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println();
				}
			}
		}
	}
}
