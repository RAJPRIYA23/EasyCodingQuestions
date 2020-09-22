/*
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Constraints:
1 <= T <= 100
1 <= N <= 1000
1 <= Ai <=1012

Example:
Input:
2
6
3 2 1 56 10000 167
5
1 345 234 21 56789
Output:
1 10000
1 56789
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
            long max=0, min=0;
            long arr[]=new long[n];
            arr[0]= sc.nextLong(); 
            min=arr[0];
            max=arr[0];
            for(int j=1;j<n;j++)
            {
                arr[j]= sc.nextLong(); 
                if(arr[j]>max)
                    max=arr[j];
                if(arr[j]<min)
                    min=arr[j];
            }
            System.out.println(min+" "+max);
        }
	}
}
