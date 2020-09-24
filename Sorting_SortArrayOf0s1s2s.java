/*
Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Constraints:
1 <= T <= 500
1 <= N <= 10^6
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.
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
        int t = Integer.parseInt(br.readLine().trim()); 
        
	    while(t-- >0)
	    {
	        int n = Integer.parseInt(br.readLine().trim());
	        int arr[] = new int[n];
	        int arr_012[] = new int[3];
	        String st[] = br.readLine().trim().split(" ");
	        for(int i=0; i < n; i++)
	        {
	            arr[i] = Integer.parseInt(st[i]);
	            arr_012[arr[i]]++;
	        }
	        
	        StringBuffer s = new StringBuffer();
	        for(int i = 0; i < arr_012[0]; i++)
	        {
	            s.append("0 ");
	        }
	        
	        for(int i = 0; i < arr_012[1]; i++)
	        {
	            s.append("1 ");
	        }
	        
	        for(int i = 0; i < arr_012[2]; i++)
	        {
	            s.append("2 ");
	        }
	        
	        System.out.println(s);
	    }
	}
}
