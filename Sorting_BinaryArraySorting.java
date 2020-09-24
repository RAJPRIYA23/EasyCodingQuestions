/*
Given a binary array A[] of size N. The task is to arrange array in increasing order.

Note: The binary array contains only 0  and 1.

Constraints:
1 < = T <= 100
1 <= N <= 106
0 <= A[i] <= 1

Example:
Input:
2
5
1 0 1 1 0
10
1 0 1 1 1 1 1 0 0 0

Output:
0 0 1 1 1
0 0 0 0 1 1 1 1 1 1
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
	        String st[] = br.readLine().trim().split(" ");
	        int count = 0;
	        for(int i=0; i<n; i++)
	        {
	            arr[i] = Integer.parseInt(st[i]);
	            if(arr[i] == 0)
	                count++;
	        }
	        
	        StringBuffer s = new StringBuffer();
	        for(int i=0; i < count; i++)
	        {
	            s.append("0 ");
	        }
	        
	        for(int i=count; i < n; i++)
	        {
	            s.append("1 ");
	        }
	        
	        System.out.println(s);
	    }
	}
}
