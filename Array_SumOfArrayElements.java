/*
Given an integer array A of size N, find sum of elements in it.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Ai <= 100

Example:
Input:
2
3
3 2 1
4
1 2 3 4
Output:
6
10
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
	        int arr[]=new int[n];
	        int sum=0;
            for(int j=0;j<n;j++)
            {
                arr[j]= sc.nextInt(); 
                sum=sum+arr[j];
            }
            System.out.println(sum);
	    }
	}
}
