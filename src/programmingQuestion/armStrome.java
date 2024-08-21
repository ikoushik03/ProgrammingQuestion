package programmingQuestion;

import java.util.Scanner;

public class armStrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count=0;
		int temp1=n;
		int temp=n;
		int pro=1;
		int sum=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);
		
		
		while(temp>0)
		{
			int rem=temp%10;
			for(int i=1; i<=count; i++)
			{
				pro=pro*rem;
			}
			sum=sum+pro;
			pro=1;
			temp=temp/10;
		}
		if(sum==temp1)
		{
			System.out.println("armstrome");
		}
		else 
		{
			System.out.println("not armstrome");
		}
	}

}
