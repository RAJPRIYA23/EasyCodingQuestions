/*
Given a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on.
You are given a number N, you have to print the number of integers less than N in the sample space S.

Constraints :
1<=T<=100
1<=N<=10^18

Example
Input :
2
9
3

Output :
2
1
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
	        long n= sc.nextLong();
	        long sum=0;
	        for(long j=1;j<=Math.ceil(Math.sqrt(n));j++)
	        {
	            if(Math.pow(j,2)<n)
	            {
	                sum++;
	            }
	            else
	            {
	                break;
	            }
	        }
	        System.out.println(sum);
	    }
	}
}
