/*
Given a positive integer N, find the Nth Even Fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.
Example 1:

Input: n = 1
Output: 2 
Explanation: 2 is the first even
number in the fibonacci series.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 
        for(int i=1;i<=t;i++)
        {
            int n = Integer.parseInt(br.readLine()); 
            long j=0, a=1, b=1, mod=1000000007, temp=0;
            for(j=1;j<=3*n-1;j++)
            {
                temp=b;
                b = (a % mod + b % mod)% mod;
                a = temp;
            }
            System.out.println(a);
        }
	}
}
