package programmingQuestion;

import java.util.Scanner;

public class armsromeNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp=n;
		int pro=1;
		int sum=0;
		int temp1=n;
		int temp3=n;
		
		int count=1;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		
	

		while(temp>10)
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
		if(sum==temp3)
		{
			System.out.println("armstrome");
		}
		else 
		{
			System.out.println("not armstrome");
		}
	}
	
}
