package programmingQuestion;

import java.util.Scanner;

public class UnsortedCountNumOfElement {

	public static void main(String[] args) 
	{
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr=new int[n];
//		for(int i=0; i<n; i++)
//		{
//			arr[i]=scan.nextInt();
//		}
		
		int []arr= {9,5,7,6,8,9,7,5,6};
       boolean temp[] = new boolean[arr.length];
       
       for(int i = 0; i<arr.length;i++)
       {
    	int count = 1;
    	   for(int j = i+1; j<arr.length;j++)
    	   {
    		   if(temp[j] == false) 
    		   {
    		   if(arr[i]==arr[j])
    		   {
    			   count++;
    			   temp[j] = true;
    		   }
    	    }
    	   }
    	   if(temp[i]==false)
    	   System.out.println(arr[i]+ " = "+count+" ");
    	    
    	   
       }
	}

}
