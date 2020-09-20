/*
Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a^3 + b^3 = N.

Example :

Input:
N = 9 
Output:
2
Explanation:
There are two solutions: (a=1, b=2)
and (a=2, b=1).
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
	        int sum=0;
	        for(int j=1;j<=Math.cbrt(n);j++)
	        {
	            for(int k=0;k<=Math.cbrt(n);k++)
	            {
	                if(Math.pow(j,3)+Math.pow(k,3)==n)
	                    sum++;             
	            }
	        }
	        System.out.println(sum);
	    }
	}
}
