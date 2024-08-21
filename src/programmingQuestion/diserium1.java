package programmingQuestion;

import java.util.Scanner;

public class diserium1 {
public static int diserium(int n)
{
	int pro=1;
	int temp=n;
	int sum=0;
	int count=0;
	int temp1=n;
	int temp3=n;
	while(temp>0)
	{
		temp=temp/10;
		count++;
     }
//	System.out.println(count);
	while(temp1>0)
	{
		int rem=temp1%10;
		for(int i=1; i<=count; i++)
		{
			
			pro=pro*rem;
		}
		sum=sum+pro;
		count--;
		pro=1;
		temp1=temp1/10;
		
	}
	return sum;
}
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
		for(int i = 1;i<=1000;i++) {
		int num = diserium(i);
		if(num==i)
		{
			System.out.println(num);
		}
		
		}
	}

	
}
