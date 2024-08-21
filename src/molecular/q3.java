package molecular;

import java.util.StringTokenizer;

class a
{
	int x,y;
	void Example(int x,int y)
	{
		x =x++;
		y = ++y+y++;
		System.out.println("x: "+x + " y:"+y);
	}
}
public class q3 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hemlo";
		String s4="flag";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
	}
}

