package molecular;
class A
{
	protected static String s="A";
}
class B extends A
{
	
}
class C extends B
{
	static void methodOf()
	{
		System.out.println(s);
	}
}

public class q1 {

	public static void main(String[] args) {
		String chars[] = {"a","b","c","a","c"};
		for(int i = 0;i<chars.length;++i)
		
		{
			for(int j=i+1;j<chars.length;j++)
			{
				if(chars[i].compareTo(chars[j])==0)
					System.out.println(chars[j]);
			}
		}
	}
	}


