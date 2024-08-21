import java.util.Scanner;

public class Vinash {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int si=0;
		int ei=0;
		int count=0;
		
		for(int i=0; i<ar.length-1; i++)
		{
			if(ar[i+1]-ar[i]==1)
			{
				ei++;
			}
			else 
			{
				if(ei-si>=2)
				{
					count++;
				}
				ei=i+1;
				si=i+1;
			}
			
		}
		if(ei-si>=2)
		{
			count++;
		}
		
		System.out.println(count);
		
		
		
	}
}
