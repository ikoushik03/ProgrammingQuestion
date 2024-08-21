package shorting;

import java.util.Scanner;

public class InsertionSort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i = 0; i<n; i++)
	{
		arr[i] = sc.nextInt();
	}
	for(int i=1;i<n; i++)
	{
		int temp = arr[i];
		int j = i-1;//2
		while(j>=0&&arr[j]>arr[temp])
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1] = temp;
	}
	
}
}
