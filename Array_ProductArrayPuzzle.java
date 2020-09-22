/*
Given an array A of size N, construct a Product Array P (of same size) such that P is equal to the product of all the elements of A except A[i].

Constraints:
1 <= T <= 10
1 <= N <= 1000
1 <= Ai <= 20

Example:
Input:
2
5
10 3 5 6 2
2
12 20
Output:
180 600 360 300 900
20 12

Explanation:
Testcase1: For the product array P, at i=0 we have 3*5*6*2. At i=1 10*5*6*2. At i=2 we have 10*3*6*2. At i=3 we have 10*3*5*2. At i=4 we have 10*3*5*6
So P is 180 600 360 300 900
*/



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
        while(t-- >0)
        {
            int n = Integer.parseInt(br.readLine()); 
            long arr[]=new long[n];
            long product=1;
            StringTokenizer tk = new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++)
            {
                arr[i]= Long.parseLong(tk.nextToken());
                product=product*arr[i];
            }
            
            
            StringBuffer sb= new StringBuffer();
            for(int i=0;i<n;i++)
            {
                sb.append(product/arr[i]+" ");
            }
            System.out.println(sb);
        }
	}
}
