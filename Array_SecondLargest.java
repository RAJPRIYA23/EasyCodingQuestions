/*
Given an array Arr of size N, print second largest element from an array.

Example:
Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);  
	    int t= sc.nextInt();  
	    for(int i=1;i<=t;i++)
	    {
	        int n= sc.nextInt();  
            int max=0,max2=0,index=0;
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]= sc.nextInt(); 
                if(arr[j]>max)
                {
                    max=arr[j];
                    index=j;
                }
            }
            arr[index]=-10;
            max=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
            System.out.println(max);
	    }
	}
}
