package programmingQuestion;

import java.util.Scanner;

public class deseriumNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int temp = n;
		int temp1 = n;
		int count=0;
		while(n>0)
		{
			 
			count++;
			 n=n/10;
			
		}
		
		int sum=0;
		int prod = 1;
		while(temp>0)
		{
			int rem = temp%10;
			for(int i = 1; i<=count;i++)
			{
				prod = prod*rem;
				
			}
			sum=sum+prod;
			prod = 1;
			temp = temp/10;
			count--;
		}
		System.out.println(sum);
		if(sum == temp1)
		{
			System.out.println("diserium");
		}
		else {
			System.out.println("not diserium");
		}
		
	}

}
