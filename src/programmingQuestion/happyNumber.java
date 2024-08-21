package programmingQuestion;

import java.util.Scanner;

public class happyNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s=0;
		int temp=n;
		while(temp>10)
		{
			
			while(n>0)
			{
			 int res=n%10;
			  s+=res*res;
			 n=n/10;
			}
			System.out.println(s);
		temp=s;
		n=s;
		s=0;
		}
		if(temp==1)
		{
			System.out.println("happy number");
		}
		else
		{
			System.out.println("not happy number");
		}
	}

}
