package programmingQuestion;

import java.util.Scanner;

public class finoncciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int f=0;
		int s=1;
		System.out.print(f+" "+s+" ");
		while(n>2)
		{
			int t=f+s;
			System.out.print(t+" ");
			f=s;
			s=t;
			n--;
					
		}
				
		
		
	}

}
